
package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.swing.*;

import com.sun.pdfview.*;
/**
 *
 * @author Daniel
 */
public class panel_recibos extends JFrame {
	
	PagePanel panelpdf;
	JFileChooser selector;
	PDFFile pdffile;
	int indice=0;
	
	public panel_recibos(){
            setSize(700,500);
		panelpdf=new PagePanel();
		JMenuBar barra=new JMenuBar();
		JMenu archivo=new JMenu("Archivo");
		JMenuItem ver=new JMenuItem("Buscar Archivo");
		ver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				indice=0;
				selector=new JFileChooser();
				int op=selector.showOpenDialog(panel_recibos.this);
				if(op==JFileChooser.APPROVE_OPTION){
					try{
					File file = selector.getSelectedFile();
			        RandomAccessFile raf = new RandomAccessFile(file, "r");
			        FileChannel channel = raf.getChannel();
			        ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,0, channel.size());
			        pdffile = new PDFFile(buf);
			        PDFPage page = pdffile.getPage(indice);
			        panelpdf.showPage(page);
			        repaint();
					}catch(IOException ioe){
						JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
					}
				}
			}
			
		});
		JPanel pabajo=new JPanel();
		JButton bsiguiente=new JButton("Siguiente");
		bsiguiente.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				indice++;
				PDFPage page = pdffile.getPage(indice);
			    panelpdf.showPage(page);
			}
			
		});
		JButton banterior=new JButton("Anterior");
		banterior.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				indice--;
				PDFPage page = pdffile.getPage(indice);
			    panelpdf.showPage(page);
			}
			
		});
		pabajo.add(banterior);
		pabajo.add(bsiguiente);
		archivo.add(ver);
		barra.add(archivo);
		setJMenuBar(barra);
		add(panelpdf);
		add(pabajo,BorderLayout.SOUTH);
	}


}
