package HiddenEngine;

// Re inport the repository


public class Main {
    public static void main(String[] args) {
        Window.Title = "The Hidden Engine Test Application";
        Window.Type = "Maximized";
        Window.Size(300, 500);
        //Window.SetRGB(200, 100, 50, 130);

        // Window.FrameLimit = 10;
        //Window.HexadecimalColor = 0x123456;

        //Window.Type = "fullscreen";
        new Window().Create();
        ///new Window().run();
    
        System.out.println("TIME!!!");
        Window.SetRGB(255, 100, 16, 150);
        Window.LoopFrame(3000);
        Window.SetRGB(100, 200, 150, 255);
        Window.LoopFrame(5000);

        //double x;
        //double y;
        //long window = Window.Window;
        //DoubleBuffer xx = Mouse.GetPosX(window, x, y);
        //System.out.println(xx + " " + y);

    }

}