package com.java9.test;

import java.util.Arrays;

public class ProcessApi {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.pid());

        System.out.println(currentProcess.info().commandLine().get());
        System.out.println(Arrays.toString(currentProcess.info().arguments().get()));
        System.out.println(currentProcess.parent().get().info().commandLine().get());
    }
}
