package HiddenEngine;

// Re inport the repository

//import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) /*throws InterruptedException*/ {
        //Window.Title = "The Hidden Engine";
        Window.Size(300, 500);
        //Window.Width = 300;
        //Window.Height = 500;
        //Window.SetRGB(200, 100, 50, 130);

        // Window.FrameLimit = 10;
        //Window.HexadecimalColor = 0x123456;

        //Window.Type = "fullscreen";
        new Window().Create();
        ///new Window().run();
        
        Window.SetRGB(100, 150, 50, 200);
        //TimeUnit.SECONDS.sleep(3);
        //new Window().ChangeScene();

        //double x;
        //double y;
        //long window = Window.Window;
        //DoubleBuffer xx = Mouse.GetPosX(window, x, y);
        //System.out.println(xx + " " + y);

    }

}