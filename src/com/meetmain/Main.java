package com.meetmain;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

class MeetMain{
    String mId;
    String mName;
    int mCap;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCap() {
        return mCap;
    }

    public void setmCap(int mCap) {
        this.mCap = mCap;
    }

    @Override
    public String toString() {
        return "MeetMain{" +
                "mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", mCap=" + mCap +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
	    List<MeetMain> meetMainList = new ArrayList<>();
	    MeetMain meetMain = new MeetMain();
	    meetMain.setmId("M001");
	    meetMain.setmName("Zoom");
	    meetMain.setmCap(50);
	    meetMainList.add(meetMain);

        MeetMain meetMain1 = new MeetMain();
        meetMain1.setmId("M002");
        meetMain1.setmName("google meet");
        meetMain1.setmCap(500);
        meetMainList.add(meetMain1);

        MeetMain meetMain2 = new MeetMain();
        meetMain2.setmId("M003");
        meetMain2.setmName("webex");
        meetMain2.setmCap(150);
        meetMainList.add(meetMain2);

        for (int i = 0; i < meetMainList.size(); i++) {
            System.out.println(meetMainList.get(i));
        }

        System.out.println("Single");
        for (int i = 0; i < meetMainList.size(); i++) {
            if (meetMainList.get(i).getmId()=="M002") {
                System.out.println(meetMainList.get(i));
            }
        }

        System.out.println("Update");
        for (int i = 0; i < meetMainList.size(); i++) {
            if (meetMainList.get(i).getmId()=="M002") {
                meetMainList.get(i).setmName("Duos");
                meetMainList.get(i).setmCap(30);
                System.out.println(meetMainList.get(i));
            }
        }

        System.out.println("Delete");
        for (int i = 0; i < meetMainList.size(); i++) {
            if (meetMainList.get(i).getmId()=="M002") {
               meetMainList.remove(i);
            }
        }

        for (int i = 0; i < meetMainList.size(); i++) {
            if (meetMainList.get(i).getmId()!="M002") {
                System.out.println("Not found");
                break;
            }
        }

    }
}
