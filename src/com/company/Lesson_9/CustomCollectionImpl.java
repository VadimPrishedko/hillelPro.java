package com.company.Lesson_9;


public class CustomCollectionImpl<E> implements CustomCollection {
    private int size = 0;
    private Entry header;
    private Entry last;

    private static class Entry<E> {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    @Override
    public boolean add(String str) {
        Entry newEntry = new Entry(str, header, last);
        if (header == null) {
            newEntry.next = null;
            newEntry.prev = null;
            header = newEntry;
            last = newEntry;
        } else {
            last.next = newEntry;
            newEntry.prev = last;
            last = newEntry;
        }

        size++;
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        if (strColl != null) {
            for (int i = 0; i < strColl.size(); i++) {
                add(strColl.get(i));
            }
            return true;
        }
        return false;

    }

    @Override
    public boolean delete(int index) {
        if (last != null) {
            Entry temp = last;
            Entry temp2 = null;
            int i = -1;
            while (temp != null) {
                i++;
                if (i == index) {
                    if (temp2 == null) {
                        header = header.next;
                    } else {
                        temp2.next = temp.next;
                    }
                }
                temp2 = temp;
                temp = temp.next;
            }
            size--;
            return true;
        }


        return false;
    }

    @Override
    public boolean delete(String str) {
        Entry temp = header;
        int i = 0;
        while (!temp.element.equals(str)) {
            i++;
            temp = temp.next;
        }
        delete(i);

        return true;
    }

    @Override
    public String get(int index) {
        Entry temp = last;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (String) temp.element;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        size = 0;
        header = null;
        last = null;

        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }
}
