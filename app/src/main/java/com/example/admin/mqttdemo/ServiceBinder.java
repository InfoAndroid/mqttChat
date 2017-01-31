package com.example.admin.mqttdemo;

import android.os.Binder;

/**
 * Created by admin on 31-01-2017.
 */
public class ServiceBinder extends Binder {
    private ChatService chatService;
    private IMessageArrivedListener mListener;

    public ServiceBinder(ChatService chatService) {
        this.chatService = chatService;
    }

    ChatService getService() {
        return chatService;
    }

    public void setMessageArrivedListener(IMessageArrivedListener listener) {
        mListener = listener;
    }

    public void messageArrived(String message) {
        if (mListener != null)
            mListener.messageArrived(message);
    }
}
