import actions.Expeditions;

import java.applet.*;
import java.awt.*;

/** * Created by Aleksandr on 14.03.2017. */
public class AoDApplet extends Applet{

    public void init()
    {
        System.out.println("Init.");
        Expeditions ex;
    }

    public void start()
    {
        System.out.println("Start");
    }

    public void stop()
    {
        System.out.println("Stop");
    }

    public void destroy()
    {
        System.out.println("Destroy");
    }

    public void paint (Graphics g)
    {
        System.out.println("Paint");
    }
}