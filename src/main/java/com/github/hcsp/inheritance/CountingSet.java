package com.github.hcsp.inheritance;

import java.util.*;

public class CountingSet {
    /** 统计"有史以来"向该集合中添加过的元素个数 */
    private int count = 0;

    HashSet<Object> myset = new HashSet<Object>();

    public boolean add(Object obj) {
        count++;
        return myset.add(obj);
    }


    public boolean addAll(Collection c) {
        count += c.size();
        return myset.addAll(c);
    }

    public int getCount() {
        return count;
    }

    public int size() {
        return myset.size();
    }

    public boolean remove(Object obj) {
        return myset.remove(obj);
    }

    public void removeAll(List obj) {
        for (Object o : obj) {
            myset.remove(o);
        }
    }

    // 我们希望创建一个Set，能够统计"有史以来"添加到其中去的元素个数
    // 但是，现在结果明显不对
    // 请尝试修复此问题
    public static void main(String[] args) {
        CountingSet countingSet = new CountingSet();
        countingSet.add(new Object());
        countingSet.addAll(Arrays.asList(1, 2, 3));

        System.out.println(countingSet.getCount());
    }
}
