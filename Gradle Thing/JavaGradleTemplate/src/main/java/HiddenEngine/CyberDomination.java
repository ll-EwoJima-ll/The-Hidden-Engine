package HiddenEngine;

import java.util.concurrent.TimeUnit;

//import java.io.IOException;
//import java.io.BufferedOutputStream;
//import java.io.OutputStream;

/*class Hardware implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
        try {
            Process process = Runtime.getRuntime().exec("FILETORUN.java");
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //String HardwareMonitor = new HardwareScan().HardwareMonitor("C:\\Users\\ll-Ew\\Downloads\\Java Projects\\Gradle Thing\\JavaGradleTemplate\\src\\main\\java\\org\\HiddenEngine\\HardwareScan.java");
    }

}
*/

public class CyberDomination {
    public static void main(String[] args) throws InterruptedException {
        //Window.Title = "The Hidden Engine";
        Window.Width = 300;
        Window.Height = 500;
        Window.SetRGB(200, 100, 50, 130);
        // Window.FrameLimit = 10;
        //Window.HexadecimalColor = 0x123456;
        Window.Type = "fullscreen";
        @SuppressWarnings("unused")
        long WindowHandle = new Window().Create();

        TimeUnit.SECONDS.wait(2);
        Window.SetRGB(100, 150, 50, 200);
        new Window().ChangeScene();

        //double x;
        //double y;
        //long window = Window.Window;
        //DoubleBuffer xx = Mouse.GetPosX(window, x, y);
        //System.out.println(xx + " " + y);

    }

}