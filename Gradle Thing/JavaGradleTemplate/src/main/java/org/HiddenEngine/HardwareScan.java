package org.HiddenEngine;

import static org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor;
import static org.lwjgl.glfw.GLFW.glfwGetVideoMode;
import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSetWindowPos;
import static org.lwjgl.glfw.GLFW.glfwSetWindowSize;
import static org.lwjgl.glfw.GLFW.glfwShowWindow;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwSwapInterval;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.system.MemoryStack.stackPush;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.net.URLClassLoader;
import java.nio.IntBuffer;

import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

// FPS, RAM Data, CPU Usage, GPU Usage
@SuppressWarnings("unused")
public class HardwareScan {
    private long CPUTime() {
        OperatingSystemMXBean OS = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        long CurrentCPUTime = ((com.sun.management.OperatingSystemMXBean) OS).getProcessCpuTime();


        return CurrentCPUTime;
    }

    private long NanoTime() {
        long CurrentNanoTime = System.nanoTime();

        return CurrentNanoTime;
    }
    
        @SuppressWarnings("static-access")
    public String main(String GameFilePath) throws IOException { // This must be called in a thread to work properly
        //((URLClassLoader)Thread.currentThread().getContextClassLoader()).getURLs();

        // Get The Last Times
        long LastCPUTime = CPUTime();
        long LastNanoTime = NanoTime();

        // Get The Current Time
        OperatingSystemMXBean OS = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        long CurrentCPUTime = ((com.sun.management.OperatingSystemMXBean) OS).getProcessCpuTime();
        long CurrentNanoTime = System.nanoTime();
        // Get Resolution
        
        String Resolution = Integer.toString(ResolutionWidth) + 'x' + Integer.toString(ResolutionHeight);

        // Get RAM Usage
        Runtime RunTime = Runtime.getRuntime();
        long MemoryAllocated = RunTime.totalMemory();
        long TargetRAMUse = RunTime.maxMemory();
        long FreeMemory = RunTime.freeMemory();
        long UsedMemory = MemoryAllocated - FreeMemory;
        System.out.println(Resolution);
        System.out.println(UsedMemory + " Bytes");

        // Get CPU Usage As  APercentage
        long CPUPercentage = 0;
        if (CurrentNanoTime > LastNanoTime) {
            CPUPercentage = ((CurrentCPUTime-LastCPUTime)*100L)/
            (CurrentNanoTime-LastNanoTime);
        }

        // Get GPU Usage



        System.out.println(Resolution);
        System.out.println(UsedMemory + " Bytes");
        System.out.println(TargetRAMUse);
        System.out.println(CPUPercentage);

        // Create Window To Show Results
        new Window().Title = "Hardware Monitor";
        @SuppressWarnings("unused")
        int Width = new Window().Width = 300;
        @SuppressWarnings("unused")
        int Height = new Window().Height = 500;
        GL.createCapabilities();
        
        

        long Window = new Window().Create();

        
        main(GameFilePath);
        LoopFrame(Window);
        return "Very Gut";
    }

    public void LoopFrame(long WindowHandle) {
        while (!glfwWindowShouldClose(WindowHandle)) {
            // Poll events (Key/mouse events)
            glfwPollEvents();

            glClearColor(2.4f, 3.2f, 1.2f, 8.4f);
            
            // Clears the window buffer
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Automatically swaps the buffers
            glfwSwapBuffers(WindowHandle);
        }
    }

}