package com.happyelements.store.tikv;

import com.sun.jna.Memory;
import com.sun.jna.Native;

public class Main {
    public static void main(String[] args) {
        GoSlice.ByValue msg = new GoSlice.ByValue();
        byte[] bytes = "Hello World!".getBytes();
        msg.data = new Memory(bytes.length * Native.getNativeSize(Long.TYPE));
        msg.data.write(0, bytes, 0, bytes.length);
        msg.len = bytes.length;
        msg.cap = bytes.length;

        GoSlice.ByValue reply = LibmathLibrary.INSTANCE.echo(msg);

        System.out.println(new String(reply.data.getByteArray(0, (int) reply.len)));

        LibmathLibrary.INSTANCE.test();
    }
}

