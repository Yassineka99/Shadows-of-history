
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Yassine
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        String f ="song.wav";
        Playm(f);
          
            new Start().setVisible(true);
            
    }

    private static void Playm(String f) {
        try {
           File path = new File(f);
           
           if (path.exists())
           {
               AudioInputStream a =AudioSystem.getAudioInputStream(path);
               Clip c = AudioSystem.getClip();
               c.open(a);
               c.start();
           }
           else {
           System.out.println("can't find");
           }
        } catch (Exception e) {
              System.out.println(e);
        }
    }
    
}
