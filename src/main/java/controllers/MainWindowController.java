package controllers;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MainWindowController {
    public void changePtoColon(ActionEvent actionEvent) throws IOException, UnsupportedFlavorException {
        String data = (String) Toolkit.getDefaultToolkit()
                .getSystemClipboard().getData(DataFlavor.stringFlavor);
        String newData = data.replaceAll("\\$P\\{",":");
        String finalData = newData.replaceAll("}","");

        StringSelection selection = new StringSelection(finalData);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);

    }

    public void changeColonToP(ActionEvent actionEvent) throws IOException, UnsupportedFlavorException {
        String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
    String newString = data.replaceAll(":", "\\$P\\{");
        //String finalString = newString.replaceAll("","");
        System.out.println(newString);

    }
}
