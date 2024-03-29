package _01_de_creacion.mvc01.src;

/*
 * Main.java
 *
 * Created on January 10, 2007, 1:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import _01_de_creacion.mvc01.src.controller.DefaultController;
import _01_de_creacion.mvc01.src.model.DocumentModel;
import _01_de_creacion.mvc01.src.model.TextElementModel;
import _01_de_creacion.mvc01.src.view.DisplayViewPanel;
import _01_de_creacion.mvc01.src.view.PropertiesViewPanel;

/**
 *
 * @author Robert Eckstein
 */
public class Main {

	/** Creates a new instance of Main */
	public Main() {

		TextElementModel textElementModel = new TextElementModel();
		DocumentModel documentModel = new DocumentModel();

		DefaultController controller = new DefaultController();

		DisplayViewPanel displayViewPanel = new DisplayViewPanel(controller);
		PropertiesViewPanel propertiesViewPanel = new PropertiesViewPanel(controller);

		controller.addView(displayViewPanel);
		controller.addView(propertiesViewPanel);
		controller.addModel(textElementModel);
		controller.addModel(documentModel);

		textElementModel.initDefault();
		documentModel.initDefault();

		JFrame displayFrame = new JFrame("Display (View 1)");
		displayFrame.getContentPane().add(displayViewPanel, BorderLayout.CENTER);
		displayFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		displayFrame.pack();

		JDialog propertiesDialog = new JDialog(displayFrame, "Properties (View 2)");
		propertiesDialog.setModal(false);
		propertiesDialog.getContentPane().add(propertiesViewPanel, BorderLayout.CENTER);
		propertiesDialog.pack();

		displayFrame.setVisible(true);
		propertiesDialog.setVisible(true);

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Main main = new Main();
	}

}
