package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        List<Label> labels = averageScoreByPupil(pupils);
        for (Label label : labels) {
            sum += label.score();
        }
        return sum / labels.size();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> averagePupilList = new ArrayList<>();
        double sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            averagePupilList.add(new Label(pupil.name(), sum / pupil.subjects().size()));
            sum = 0;
        }
        return averagePupilList;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjects = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (subjects.containsKey(subject.name())) {
                    subjects.put(subject.name(), subjects.get(subject.name()) + subject.score());
                } else {
                    subjects.put(subject.name(), subject.score());
                }
            }
        }
        List<Label> averageSubject = new ArrayList<>();
        double amount = pupils.size();
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            averageSubject.add(new Label(entry.getKey(), entry.getValue() / amount));
        }
        return averageSubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        SortedSet<Label> bestStudents = new TreeSet<>();
        double sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            bestStudents.add(new Label(pupil.name(), sum));
            sum = 0;
        }
        return bestStudents.last();
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> mapSubject = new LinkedHashMap<>();
        TreeSet<Label> bestSubjects = null;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!mapSubject.containsKey(subject.name())) {
                    mapSubject.put(subject.name(), subject.score());
                } else {
                    mapSubject.put(subject.name(), mapSubject.get(subject.name()) + subject.score());
                }
            }
            bestSubjects = new TreeSet<>();
            for (Map.Entry<String, Integer> entry : mapSubject.entrySet()) {
                bestSubjects.add(new Label(entry.getKey(), entry.getValue()));
            }
        }
        return bestSubjects.last();
    }
}