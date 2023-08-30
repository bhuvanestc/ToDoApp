package org.example.data.sequencer;

public class TodoItemidSequencer {
    private static int currentid;
    public static int nextId()
    {
        return ++currentid;
    }
    public static int getCurrentId(){
        return currentid;

    }
    public static void setCurrentId(int currentid){
        TodoItemidSequencer.currentid=currentid;
    }
}
