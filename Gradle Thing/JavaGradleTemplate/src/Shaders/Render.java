package HiddenEngine.Shaders;
//import org.lwjgl.opengl.create

public class Render {

    private String vertexShaderSrc = "#type vertex\r\n" + //
                "#version 330 core\r\n" + //
                "layout (location=0) in vec3 aPos;\r\n" + //
                "layout (location=1) in vec4 aColor;\r\n" + //
                "\r\n" + //
                "out vec4 fColor;\r\n" + //
                "\r\n" + //
                "void main()\r\n" + //
                "{\r\n" + //
                "    fColor = aColor;\r\n" + //
                "    fl_Position = vec4(aPos, 1.0);\r\n" + //
                "}";

    private String fragmentShaderSrc = "#version 330 core\r\n" + //
                "\r\n" + //
                "in vec4 fColor;\r\n" + //
                "\r\n" + //
                "out vec4 color;\r\n" + //
                "\r\n" + //
                "void main()\r\n" + //
                "{\r\n" + //
                "    color = fColor;\r\n" + //
                "}";
                private int vertex, fragmentID, shaderProgram;

                @Overide
                public void init() {
                    // Compile & Link Shaders

                    // Load And Compile The Vertex Shader

                    vertexID = glCreateShader()
                }
                
}

/*public static int Label() {
        
    return 1;
}*/