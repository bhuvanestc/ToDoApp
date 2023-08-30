package org.example.data.sequencer;

public class PersonidSequencer {
    private static int currentid;
    public static int nextId()
    {
     return ++currentid;
    }
    public static int getCurrentId(){
        return currentid;

    }
    public static void setCurrentId(int currentid){
        PersonidSequencer.currentid=currentid;
    }
}
