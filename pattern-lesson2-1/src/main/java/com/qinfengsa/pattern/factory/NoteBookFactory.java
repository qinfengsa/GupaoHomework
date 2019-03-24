package com.qinfengsa.pattern.factory;

import com.qinfengsa.pattern.factory.entity.INoteBook;
import com.qinfengsa.pattern.factory.entity.MacBook;
import com.qinfengsa.pattern.factory.entity.MateBook;

/**
 * 笔记本简单工厂
 */
public class NoteBookFactory {
    private static final int MAC_BOOK = 1;
    private static final int MATE_BOOK = 2;

    public INoteBook create(int type) {
        switch (type) {
            case MAC_BOOK :
                return new MacBook();
            case MATE_BOOK :
                return new MateBook();
            default:
                return null;
        }
    }
}
