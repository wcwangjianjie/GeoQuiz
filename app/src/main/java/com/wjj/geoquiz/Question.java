package com.wjj.geoquiz;

/**
 * @author 作者：wangjj
 * @version 创建时间：2017/8/17 9:56
 * @discription 类说明：该类的一个实例代表一道题目
 */
public class Question {
    private int mTextId;
    private boolean mAnswerTrue;

    public Question(int textId, boolean answerTrue) {
        mTextId = textId;
        mAnswerTrue = answerTrue;
    }

    public int getTextId() {
        return mTextId;
    }

    public void setTextId(int textId) {
        mTextId = textId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
