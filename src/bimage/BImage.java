package bimage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;;

public class BImage {
	public static void main(String[] args) {
		File fileImage = new File("C:\\Java\\THGAFSLdjygAS\\src\\bimage\\image.png");
		BufferedImage img = null;

		try {
			img = ImageIO.read(fileImage);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}

		if (img != null) {
			img = toGrayScale(img);
			display(img);
		}

	}

	private static BufferedImage toGrayScale(BufferedImage img) {
		System.out.println(" Converting to GrayScale2.");
		BufferedImage grayImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		Graphics graphics = grayImage.getGraphics();
		graphics.drawImage(img, 0, 0, null);
		graphics.dispose();

		return grayImage;
	}

	private static void display(BufferedImage img) {
		System.out.println(" Display image.");
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setSize(img.getWidth(), img.getHeight());
		label.setIcon(new ImageIcon(img));
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
