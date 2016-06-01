package com.jmeo.socket;

import com.jmeo.config.Config;
import com.jmeo.control.ControlAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jmeo on 2016/5/31.
 */
public class SocketServer {

    private static ServerSocket server;
    private static Socket socket;

    private static void initServer() throws Exception {
        if(server == null || server.isClosed()){
            server = new ServerSocket(Integer.valueOf(Config.getProperty("port")));
            System.out.println("the server started ..... ");
        }
    }

    public static void start(){
        try {
            initServer();
            while (true){
                socket = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line = in.readLine();
                System.out.println(line);
                ControlAction.Analysis(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stop() throws IOException {
        socket.close();
        server.close();
    }


}
