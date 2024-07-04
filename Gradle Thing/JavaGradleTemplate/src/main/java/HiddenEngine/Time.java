package HiddenEngine;

public class Time {

    public static void NanoTimer(int TimeLimit) {
        float StartingTime = System.nanoTime();

        boolean TimerGoing = true;
        while (TimerGoing == true) {
            float CurrentTime = System.nanoTime() - StartingTime;
            if (CurrentTime >= TimeLimit) {
                TimerGoing = false;
            }

        }
    }

    public static void StartNanoTime(float TimeStartedInNano) {
        TimeStartedInNano = System.nanoTime();
    }
    public static long StartMilliTime() {
        return System.currentTimeMillis();
    }

    public float GetDiffInNanoSeconds(float TimeStartedInNano) {
        return System.nanoTime() - TimeStartedInNano;
    }

    public static long GetDiffInMilliSeconds(long TimeStartedInMilli) {
        return System.currentTimeMillis() - TimeStartedInMilli;
    }

    public static int GetTimeInSeconds(float TimeStartedInNano) {
        return (int)((System.nanoTime() - TimeStartedInNano) * 1E-9);
    }
    public static int GetdiffInSeconds(float TimeStartedInMilli) {
        long milli = (long) (System.currentTimeMillis() - TimeStartedInMilli);
        return Math.round(milli);
    }
}