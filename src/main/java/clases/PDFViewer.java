import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PDFViewer {

    public static void displayPDF(File pdfFile, JDesktopPane desktopPane) {
        try {
            // Cargar el documento PDF usando el nuevo método Loader
            PDDocument document = Loader.loadPDF(pdfFile);
            PDFRenderer pdfRenderer = new PDFRenderer(document);

            // Renderizar la primera página del PDF a una imagen
            BufferedImage image = pdfRenderer.renderImageWithDPI(0, 300); // 300 DPI para alta calidad

            // Crear un panel para mostrar la imagen
            JPanel pdfPanel = new JPanel();
            pdfPanel.setLayout(new BorderLayout());

            // Crear un componente para mostrar la imagen
            JLabel pdfLabel = new JLabel(new ImageIcon(image));
            pdfPanel.add(pdfLabel, BorderLayout.CENTER);

            // Crear un JInternalFrame para el panel
            JInternalFrame internalFrame = new JInternalFrame("PDF Preview", true, true, true, true);
            internalFrame.setSize(800, 600); // Tamaño del internal frame
            internalFrame.setContentPane(pdfPanel);
            internalFrame.setVisible(true);

            // Agregar el internal frame al JDesktopPane
            desktopPane.add(internalFrame);
            internalFrame.moveToFront(); // Mover el internal frame al frente

            // Cerrar el documento PDF
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
