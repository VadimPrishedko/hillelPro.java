package com.company.Lesson_10;
import java.util.*;

public class RemoveDuplicates {

        public static <E> Collection<E> removeDuplicates(Collection<E> collection) {
            return new HashSet<>(collection);
    }
}
