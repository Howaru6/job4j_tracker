package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        Comparator<Attachment> comparator1 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(comparator1);
        System.out.println(attachments);
        Comparator<Attachment> cmpText = (left, right) ->
                left.getName().compareTo(right.getName());
        attachments.sort(cmpText);
        System.out.println(attachments);
        Comparator<Attachment> cmpDescSize = (left, right) ->
                Integer.compare(right.getName().length(),
                        left.getName().length());
        attachments.sort(cmpDescSize);
        System.out.println(attachments);
    }
}