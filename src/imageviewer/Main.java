package imageviewer;

import Control.NextImageCommand;
import Control.PrevImageCommand;
import Persistence.ImageLoader;
import Persistence.files.FileImageLoader;

public class Main {

    public static void main(String[] args) {
        ImageLoader imageLoader  = new FileImageLoader("imagenes");
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new NextImageCommand(mainFrame.getImageDisplay()));
        mainFrame.add(new PrevImageCommand(mainFrame.getImageDisplay()));
        mainFrame.getImageDisplay().display(imageLoader.load());
    }
    
}
