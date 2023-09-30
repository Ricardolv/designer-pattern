package br.com.richard.adapter.tvPort.devices;

import br.com.richard.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println(">>> This is your video: " + image);
    }

}
