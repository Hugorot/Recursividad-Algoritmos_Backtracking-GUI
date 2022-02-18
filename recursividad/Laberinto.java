
package recursividad;

import java.awt.Image;
import java.io.File;
import static java.lang.String.valueOf;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.metal.MetalIconFactory;

/**
 * Codigo practico, GUI y Ficheros.
 * Universidad Catolica Santiago de Guayaquil.
 * @author PC
 */
public class Laberinto extends javax.swing.JFrame {

   
    public Laberinto() {
        initComponents();
        ocultar();

    }

    public void ocultar() {
        a0.setVisible(false);
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);
        a7.setVisible(false);
        b0.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        c0.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        d0.setVisible(false);
        d1.setVisible(false);
        d2.setVisible(false);
        d3.setVisible(false);
        d4.setVisible(false);
        d5.setVisible(false);
        d6.setVisible(false);
        d7.setVisible(false);
        e0.setVisible(false);
        e1.setVisible(false);
        e2.setVisible(false);
        e3.setVisible(false);
        e4.setVisible(false);
        e5.setVisible(false);
        e6.setVisible(false);
        e7.setVisible(false);
        f0.setVisible(false);
        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
        f6.setVisible(false);
        f7.setVisible(false);
        g0.setVisible(false);
        g1.setVisible(false);
        g2.setVisible(false);
        g3.setVisible(false);
        g4.setVisible(false);
        g5.setVisible(false);
        g6.setVisible(false);
        g7.setVisible(false);
        h0.setVisible(false);
        h1.setVisible(false);
        h2.setVisible(false);
        h3.setVisible(false);
        h4.setVisible(false);
        h5.setVisible(false);
        h6.setVisible(false);
        h7.setVisible(false);
        i0.setVisible(false);
        i1.setVisible(false);
        i2.setVisible(false);
        i3.setVisible(false);
        i4.setVisible(false);
        i5.setVisible(false);
        i6.setVisible(false);
        i7.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a0 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        b0 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        c0 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        d0 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        e0 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        f0 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        f6 = new javax.swing.JLabel();
        f7 = new javax.swing.JLabel();
        g0 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        g6 = new javax.swing.JLabel();
        g7 = new javax.swing.JLabel();
        h0 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        i0 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        labImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laberinto");
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(350, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        prota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mega.gif"))); // NOI18N
        prota.setToolTipText("");
        prota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prota.setDisabledIcon(null);
        prota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(prota);
        prota.setBounds(130, 10, 40, 30);

        a0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a0.setToolTipText("");
        a0.setFocusable(false);
        a0.setInheritsPopupMenu(false);
        a0.setRequestFocusEnabled(false);
        a0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a0);
        a0.setBounds(30, 50, 30, 20);

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a1.setFocusable(false);
        a1.setInheritsPopupMenu(false);
        a1.setRequestFocusEnabled(false);
        a1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a1);
        a1.setBounds(30, 70, 30, 20);

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a2.setFocusable(false);
        a2.setInheritsPopupMenu(false);
        a2.setRequestFocusEnabled(false);
        a2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a2);
        a2.setBounds(30, 90, 30, 20);

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a3.setFocusable(false);
        a3.setInheritsPopupMenu(false);
        a3.setRequestFocusEnabled(false);
        a3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a3);
        a3.setBounds(30, 110, 30, 20);

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a4.setFocusable(false);
        a4.setInheritsPopupMenu(false);
        a4.setRequestFocusEnabled(false);
        a4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a4);
        a4.setBounds(30, 130, 30, 20);

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a5.setFocusable(false);
        a5.setInheritsPopupMenu(false);
        a5.setRequestFocusEnabled(false);
        a5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a5);
        a5.setBounds(30, 150, 30, 20);

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a6.setFocusable(false);
        a6.setInheritsPopupMenu(false);
        a6.setRequestFocusEnabled(false);
        a6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a6);
        a6.setBounds(30, 170, 30, 20);

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        a7.setFocusable(false);
        a7.setInheritsPopupMenu(false);
        a7.setRequestFocusEnabled(false);
        a7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(a7);
        a7.setBounds(30, 190, 30, 20);

        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b0.setToolTipText("");
        b0.setFocusable(false);
        b0.setInheritsPopupMenu(false);
        b0.setRequestFocusEnabled(false);
        b0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b0);
        b0.setBounds(60, 50, 30, 20);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b1.setToolTipText("");
        b1.setFocusable(false);
        b1.setInheritsPopupMenu(false);
        b1.setRequestFocusEnabled(false);
        b1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b1);
        b1.setBounds(60, 70, 30, 20);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b2.setToolTipText("");
        b2.setFocusable(false);
        b2.setInheritsPopupMenu(false);
        b2.setRequestFocusEnabled(false);
        b2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b2);
        b2.setBounds(60, 90, 30, 20);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b3.setToolTipText("");
        b3.setFocusable(false);
        b3.setInheritsPopupMenu(false);
        b3.setRequestFocusEnabled(false);
        b3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b3);
        b3.setBounds(60, 110, 30, 20);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b4.setToolTipText("");
        b4.setFocusable(false);
        b4.setInheritsPopupMenu(false);
        b4.setRequestFocusEnabled(false);
        b4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b4);
        b4.setBounds(60, 130, 30, 20);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b5.setToolTipText("");
        b5.setFocusable(false);
        b5.setInheritsPopupMenu(false);
        b5.setRequestFocusEnabled(false);
        b5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b5);
        b5.setBounds(60, 150, 30, 20);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b6.setToolTipText("");
        b6.setFocusable(false);
        b6.setInheritsPopupMenu(false);
        b6.setRequestFocusEnabled(false);
        b6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b6);
        b6.setBounds(60, 170, 30, 20);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        b7.setToolTipText("");
        b7.setFocusable(false);
        b7.setInheritsPopupMenu(false);
        b7.setRequestFocusEnabled(false);
        b7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(b7);
        b7.setBounds(60, 190, 30, 20);

        c0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c0.setToolTipText("");
        c0.setFocusable(false);
        c0.setInheritsPopupMenu(false);
        c0.setRequestFocusEnabled(false);
        c0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c0);
        c0.setBounds(90, 50, 20, 20);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c1.setToolTipText("");
        c1.setFocusable(false);
        c1.setInheritsPopupMenu(false);
        c1.setRequestFocusEnabled(false);
        c1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c1);
        c1.setBounds(90, 70, 20, 20);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c2.setToolTipText("");
        c2.setFocusable(false);
        c2.setInheritsPopupMenu(false);
        c2.setRequestFocusEnabled(false);
        c2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c2);
        c2.setBounds(90, 90, 20, 20);

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c3.setToolTipText("");
        c3.setFocusable(false);
        c3.setInheritsPopupMenu(false);
        c3.setRequestFocusEnabled(false);
        c3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c3);
        c3.setBounds(90, 110, 20, 20);

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c4.setToolTipText("");
        c4.setFocusable(false);
        c4.setInheritsPopupMenu(false);
        c4.setRequestFocusEnabled(false);
        c4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c4);
        c4.setBounds(90, 130, 20, 20);

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c5.setToolTipText("");
        c5.setFocusable(false);
        c5.setInheritsPopupMenu(false);
        c5.setRequestFocusEnabled(false);
        c5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c5);
        c5.setBounds(90, 150, 20, 20);

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c6.setToolTipText("");
        c6.setFocusable(false);
        c6.setInheritsPopupMenu(false);
        c6.setRequestFocusEnabled(false);
        c6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c6);
        c6.setBounds(90, 170, 20, 20);

        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        c7.setToolTipText("");
        c7.setFocusable(false);
        c7.setInheritsPopupMenu(false);
        c7.setRequestFocusEnabled(false);
        c7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(c7);
        c7.setBounds(90, 190, 20, 20);

        d0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d0.setToolTipText("");
        d0.setFocusable(false);
        d0.setInheritsPopupMenu(false);
        d0.setRequestFocusEnabled(false);
        d0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d0);
        d0.setBounds(110, 50, 30, 20);

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d1.setToolTipText("");
        d1.setFocusable(false);
        d1.setInheritsPopupMenu(false);
        d1.setRequestFocusEnabled(false);
        d1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d1);
        d1.setBounds(110, 70, 30, 20);

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d2.setToolTipText("");
        d2.setFocusable(false);
        d2.setInheritsPopupMenu(false);
        d2.setRequestFocusEnabled(false);
        d2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d2);
        d2.setBounds(110, 90, 30, 20);

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d3.setToolTipText("");
        d3.setFocusable(false);
        d3.setInheritsPopupMenu(false);
        d3.setRequestFocusEnabled(false);
        d3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d3);
        d3.setBounds(110, 110, 30, 20);

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d4.setToolTipText("");
        d4.setFocusable(false);
        d4.setInheritsPopupMenu(false);
        d4.setRequestFocusEnabled(false);
        d4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d4);
        d4.setBounds(110, 130, 30, 20);

        d5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d5.setToolTipText("");
        d5.setFocusable(false);
        d5.setInheritsPopupMenu(false);
        d5.setRequestFocusEnabled(false);
        d5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d5);
        d5.setBounds(110, 150, 30, 20);

        d6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d6.setToolTipText("");
        d6.setFocusable(false);
        d6.setInheritsPopupMenu(false);
        d6.setRequestFocusEnabled(false);
        d6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d6);
        d6.setBounds(110, 170, 30, 20);

        d7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        d7.setToolTipText("");
        d7.setFocusable(false);
        d7.setInheritsPopupMenu(false);
        d7.setRequestFocusEnabled(false);
        d7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(d7);
        d7.setBounds(110, 190, 30, 20);

        e0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e0.setFocusable(false);
        e0.setInheritsPopupMenu(false);
        e0.setRequestFocusEnabled(false);
        e0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e0);
        e0.setBounds(140, 50, 30, 20);

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e1.setFocusable(false);
        e1.setInheritsPopupMenu(false);
        e1.setRequestFocusEnabled(false);
        e1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e1);
        e1.setBounds(140, 70, 30, 20);

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e2.setFocusable(false);
        e2.setInheritsPopupMenu(false);
        e2.setRequestFocusEnabled(false);
        e2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e2);
        e2.setBounds(140, 90, 30, 20);

        e3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e3.setFocusable(false);
        e3.setInheritsPopupMenu(false);
        e3.setRequestFocusEnabled(false);
        e3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e3);
        e3.setBounds(140, 110, 30, 20);

        e4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e4.setFocusable(false);
        e4.setInheritsPopupMenu(false);
        e4.setRequestFocusEnabled(false);
        e4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e4);
        e4.setBounds(140, 130, 30, 20);

        e5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e5.setFocusable(false);
        e5.setInheritsPopupMenu(false);
        e5.setRequestFocusEnabled(false);
        e5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e5);
        e5.setBounds(140, 150, 30, 20);

        e6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e6.setFocusable(false);
        e6.setInheritsPopupMenu(false);
        e6.setRequestFocusEnabled(false);
        e6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e6);
        e6.setBounds(140, 170, 30, 20);

        e7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        e7.setFocusable(false);
        e7.setInheritsPopupMenu(false);
        e7.setRequestFocusEnabled(false);
        e7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(e7);
        e7.setBounds(140, 190, 30, 20);

        f0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f0.setToolTipText("");
        f0.setFocusable(false);
        f0.setInheritsPopupMenu(false);
        f0.setRequestFocusEnabled(false);
        f0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f0);
        f0.setBounds(170, 50, 20, 20);

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f1.setToolTipText("");
        f1.setFocusable(false);
        f1.setInheritsPopupMenu(false);
        f1.setRequestFocusEnabled(false);
        f1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f1);
        f1.setBounds(170, 70, 20, 20);

        f2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f2.setToolTipText("");
        f2.setFocusable(false);
        f2.setInheritsPopupMenu(false);
        f2.setRequestFocusEnabled(false);
        f2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f2);
        f2.setBounds(170, 90, 20, 20);

        f3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f3.setToolTipText("");
        f3.setFocusable(false);
        f3.setInheritsPopupMenu(false);
        f3.setRequestFocusEnabled(false);
        f3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f3);
        f3.setBounds(170, 110, 20, 20);

        f4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f4.setToolTipText("");
        f4.setFocusable(false);
        f4.setInheritsPopupMenu(false);
        f4.setRequestFocusEnabled(false);
        f4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f4);
        f4.setBounds(170, 130, 20, 20);

        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f5.setToolTipText("");
        f5.setFocusable(false);
        f5.setInheritsPopupMenu(false);
        f5.setRequestFocusEnabled(false);
        f5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f5);
        f5.setBounds(170, 150, 20, 20);

        f6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f6.setToolTipText("");
        f6.setFocusable(false);
        f6.setInheritsPopupMenu(false);
        f6.setRequestFocusEnabled(false);
        f6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f6);
        f6.setBounds(170, 170, 20, 20);

        f7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        f7.setToolTipText("");
        f7.setFocusable(false);
        f7.setInheritsPopupMenu(false);
        f7.setRequestFocusEnabled(false);
        f7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(f7);
        f7.setBounds(170, 190, 20, 20);

        g0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g0.setToolTipText("");
        g0.setFocusable(false);
        g0.setInheritsPopupMenu(false);
        g0.setRequestFocusEnabled(false);
        g0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g0);
        g0.setBounds(190, 50, 30, 20);

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g1.setToolTipText("");
        g1.setFocusable(false);
        g1.setInheritsPopupMenu(false);
        g1.setRequestFocusEnabled(false);
        g1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g1);
        g1.setBounds(190, 70, 30, 20);

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g2.setToolTipText("");
        g2.setFocusable(false);
        g2.setInheritsPopupMenu(false);
        g2.setRequestFocusEnabled(false);
        g2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g2);
        g2.setBounds(190, 90, 30, 20);

        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g3.setToolTipText("");
        g3.setFocusable(false);
        g3.setInheritsPopupMenu(false);
        g3.setRequestFocusEnabled(false);
        g3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g3);
        g3.setBounds(190, 110, 30, 20);

        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g4.setToolTipText("");
        g4.setFocusable(false);
        g4.setInheritsPopupMenu(false);
        g4.setRequestFocusEnabled(false);
        g4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g4);
        g4.setBounds(190, 130, 30, 20);

        g5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g5.setToolTipText("");
        g5.setFocusable(false);
        g5.setInheritsPopupMenu(false);
        g5.setRequestFocusEnabled(false);
        g5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g5);
        g5.setBounds(190, 150, 30, 20);

        g6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g6.setToolTipText("");
        g6.setFocusable(false);
        g6.setInheritsPopupMenu(false);
        g6.setRequestFocusEnabled(false);
        g6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g6);
        g6.setBounds(190, 170, 30, 20);

        g7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        g7.setToolTipText("");
        g7.setFocusable(false);
        g7.setInheritsPopupMenu(false);
        g7.setRequestFocusEnabled(false);
        g7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(g7);
        g7.setBounds(190, 190, 30, 20);

        h0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h0.setToolTipText("");
        h0.setFocusable(false);
        h0.setInheritsPopupMenu(false);
        h0.setRequestFocusEnabled(false);
        h0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h0);
        h0.setBounds(220, 50, 30, 20);

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h1.setToolTipText("");
        h1.setFocusable(false);
        h1.setInheritsPopupMenu(false);
        h1.setRequestFocusEnabled(false);
        h1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h1);
        h1.setBounds(220, 70, 30, 20);

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h2.setToolTipText("");
        h2.setFocusable(false);
        h2.setInheritsPopupMenu(false);
        h2.setRequestFocusEnabled(false);
        h2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h2);
        h2.setBounds(220, 90, 30, 20);

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h3.setToolTipText("");
        h3.setFocusable(false);
        h3.setInheritsPopupMenu(false);
        h3.setRequestFocusEnabled(false);
        h3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h3);
        h3.setBounds(220, 110, 30, 20);

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h4.setToolTipText("");
        h4.setFocusable(false);
        h4.setInheritsPopupMenu(false);
        h4.setRequestFocusEnabled(false);
        h4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h4);
        h4.setBounds(220, 130, 30, 20);

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h5.setToolTipText("");
        h5.setFocusable(false);
        h5.setInheritsPopupMenu(false);
        h5.setRequestFocusEnabled(false);
        h5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h5);
        h5.setBounds(220, 150, 30, 20);

        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h6.setToolTipText("");
        h6.setFocusable(false);
        h6.setInheritsPopupMenu(false);
        h6.setRequestFocusEnabled(false);
        h6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h6);
        h6.setBounds(220, 170, 30, 20);

        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        h7.setToolTipText("");
        h7.setFocusable(false);
        h7.setInheritsPopupMenu(false);
        h7.setRequestFocusEnabled(false);
        h7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(h7);
        h7.setBounds(220, 190, 30, 20);

        i0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i0.setToolTipText("");
        i0.setFocusable(false);
        i0.setInheritsPopupMenu(false);
        i0.setRequestFocusEnabled(false);
        i0.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i0);
        i0.setBounds(250, 50, 30, 20);

        i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i1.setToolTipText("");
        i1.setFocusable(false);
        i1.setInheritsPopupMenu(false);
        i1.setRequestFocusEnabled(false);
        i1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i1);
        i1.setBounds(250, 70, 30, 20);

        i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i2.setToolTipText("");
        i2.setFocusable(false);
        i2.setInheritsPopupMenu(false);
        i2.setRequestFocusEnabled(false);
        i2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i2);
        i2.setBounds(250, 90, 30, 20);

        i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i3.setToolTipText("");
        i3.setFocusable(false);
        i3.setInheritsPopupMenu(false);
        i3.setRequestFocusEnabled(false);
        i3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i3);
        i3.setBounds(250, 110, 30, 20);

        i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i4.setToolTipText("");
        i4.setFocusable(false);
        i4.setInheritsPopupMenu(false);
        i4.setRequestFocusEnabled(false);
        i4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i4);
        i4.setBounds(250, 130, 30, 20);

        i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i5.setToolTipText("");
        i5.setFocusable(false);
        i5.setInheritsPopupMenu(false);
        i5.setRequestFocusEnabled(false);
        i5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i5);
        i5.setBounds(250, 150, 30, 20);

        i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i6.setToolTipText("");
        i6.setFocusable(false);
        i6.setInheritsPopupMenu(false);
        i6.setRequestFocusEnabled(false);
        i6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i6);
        i6.setBounds(250, 170, 30, 20);

        i7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/megachiquito.gif"))); // NOI18N
        i7.setToolTipText("");
        i7.setFocusable(false);
        i7.setInheritsPopupMenu(false);
        i7.setRequestFocusEnabled(false);
        i7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(i7);
        i7.setBounds(250, 190, 30, 20);

        labImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lab2.png"))); // NOI18N
        getContentPane().add(labImage);
        labImage.setBounds(30, 40, 230, 178);

        jButton1.setText("Solución");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 230, 90, 30);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 230, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casillacomprobada(Laberinto laberinto) {
        if (Laberinto.laberinto.equals('#')) {
            System.out.println("es un muro");
        } else if (Laberinto.laberinto.equals('.')) {
            System.out.println("el prota se mueve");
        }

    }

    private void iniciar() {

        ArrayList<JLabel> etiquetas = new ArrayList<JLabel>();
        etiquetas.add(a0);

        Icon mega = new ImageIcon("megachiquito.png");

        a0.setText(String.valueOf(laberinto[0][0]));
        a1.setText(String.valueOf(laberinto[0][1]));
        a2.setText(String.valueOf(laberinto[0][2]));
        a3.setText(String.valueOf(laberinto[0][3]));
        a4.setText(String.valueOf(laberinto[0][4]));
        a5.setText(String.valueOf(laberinto[0][5]));
        a6.setText(String.valueOf(laberinto[0][6]));
        a7.setText(String.valueOf(laberinto[0][7]));
        b0.setText(String.valueOf(laberinto[1][0]));
        b1.setText(String.valueOf(laberinto[1][1]));
        b2.setText(String.valueOf(laberinto[1][2]));
        b3.setText(String.valueOf(laberinto[1][3]));
        b4.setText(String.valueOf(laberinto[1][4]));
        b5.setText(String.valueOf(laberinto[1][5]));
        b6.setText(String.valueOf(laberinto[1][6]));
        b7.setText(String.valueOf(laberinto[1][7]));
        c0.setText(String.valueOf(laberinto[2][0]));
        c1.setText(String.valueOf(laberinto[2][1]));
        c2.setText(String.valueOf(laberinto[2][2]));
        c3.setText(String.valueOf(laberinto[2][3]));
        c4.setText(String.valueOf(laberinto[2][4]));
        c5.setText(String.valueOf(laberinto[2][5]));
        c6.setText(String.valueOf(laberinto[2][6]));
        c7.setText(String.valueOf(laberinto[2][7]));
        d0.setText(String.valueOf(laberinto[3][0]));
        d1.setText(String.valueOf(laberinto[3][1]));
        d2.setText(String.valueOf(laberinto[3][2]));
        d3.setText(String.valueOf(laberinto[3][3]));
        d4.setText(String.valueOf(laberinto[3][4]));
        d5.setText(String.valueOf(laberinto[3][5]));
        d6.setText(String.valueOf(laberinto[3][6]));
        d7.setText(String.valueOf(laberinto[3][7]));
        e0.setText(String.valueOf(laberinto[4][0]));
        e1.setText(String.valueOf(laberinto[4][1]));
        e2.setText(String.valueOf(laberinto[4][2]));
        e3.setText(String.valueOf(laberinto[4][3]));
        e4.setText(String.valueOf(laberinto[4][4]));
        e5.setText(String.valueOf(laberinto[4][5]));
        e6.setText(String.valueOf(laberinto[4][6]));
        e7.setText(String.valueOf(laberinto[4][7]));
        f0.setText(String.valueOf(laberinto[5][0]));
        f1.setText(String.valueOf(laberinto[5][1]));
        f2.setText(String.valueOf(laberinto[5][2]));
        f3.setText(String.valueOf(laberinto[5][3]));
        f4.setText(String.valueOf(laberinto[5][4]));
        f5.setText(String.valueOf(laberinto[5][5]));
        f6.setText(String.valueOf(laberinto[5][6]));
        f7.setText(String.valueOf(laberinto[5][7]));
        g0.setText(String.valueOf(laberinto[6][0]));
        g1.setText(String.valueOf(laberinto[6][1]));
        g2.setText(String.valueOf(laberinto[6][2]));
        g3.setText(String.valueOf(laberinto[6][3]));
        g4.setText(String.valueOf(laberinto[6][4]));
        g5.setText(String.valueOf(laberinto[6][5]));
        g6.setText(String.valueOf(laberinto[6][6]));
        g7.setText(String.valueOf(laberinto[6][7]));
        h0.setText(String.valueOf(laberinto[7][0]));
        h1.setText(String.valueOf(laberinto[7][1]));
        h2.setText(String.valueOf(laberinto[7][2]));
        h3.setText(String.valueOf(laberinto[7][3]));
        h4.setText(String.valueOf(laberinto[7][4]));
        h5.setText(String.valueOf(laberinto[7][5]));
        h6.setText(String.valueOf(laberinto[7][6]));
        h7.setText(String.valueOf(laberinto[7][7]));
//        i0.setText(String.valueOf(laberinto[8][0]));
//        i1.setText(String.valueOf(laberinto[8][1]));
//        i2.setText(String.valueOf(laberinto[8][2]));
//        i3.setText(String.valueOf(laberinto[8][3]));
//        i4.setText(String.valueOf(laberinto[8][4]));
//        i5.setText(String.valueOf(laberinto[8][5]));
//        i6.setText(String.valueOf(laberinto[8][6]));
//        i7.setText(String.valueOf(laberinto[8][7]));

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Icon mega = new ImageIcon("megachiquito.png");
        Icon muro = new ImageIcon("blanco.png");
        Icon png = new ImageIcon("png.png");
         Icon icon = new javax.swing.ImageIcon(getClass().getResource("/image/youwin.gif"));
        
        try {
            if (laberinto[0][0] == '#') {a0.setVisible(false);}
            else if(laberinto[0][0]=='.'||laberinto[0][0]=='.'){a0.setVisible(true);}            
           
            if (laberinto[0][1] == '#') {b0.setVisible(false);}
            else if(laberinto[0][1]=='.'||laberinto[0][1]=='.'){b0.setVisible(true);}
            
            if (laberinto[0][2] == '#') {c0.setVisible(false);}
            else if(laberinto[0][2]=='.'||laberinto[0][2]=='.'){c0.setVisible(true);}
            
            if (laberinto[0][3] == '#') { d0.setVisible(false);}
            else if(laberinto[0][3]=='.'||laberinto[0][3]=='.'){d0.setVisible(true);}
            
            if (laberinto[0][4] == '#') { e0.setVisible(false);}
             else if(laberinto[0][4]=='.'||laberinto[0][4]=='.'){e0.setVisible(true);}
            
            if (laberinto[0][5] == '#') {f0.setVisible(false);}
            else if(laberinto[0][5]=='.'||laberinto[0][5]=='.'){f0.setVisible(true);}
            
            if (laberinto[0][6] == '#') {g0.setVisible(false);}
            else if(laberinto[0][6]=='.'||laberinto[0][6]=='.'){f0.setVisible(true);}
            
            if (laberinto[0][7] == '#') {h0.setVisible(false);}
            else if(laberinto[0][7]=='.'||laberinto[0][7]=='.'){h0.setVisible(true);}
            
            if (laberinto[0][8] == '#') {i0.setVisible(false);}
             else if(laberinto[0][8]=='.'||laberinto[0][8]=='.'){i0.setVisible(true);}
            
            
            
            if (laberinto[1][0] == '#') {a1.setVisible(false);}
            else if(laberinto[1][0]=='.'||laberinto[1][0]=='.'){a1.setVisible(true);}            
           
            if (laberinto[1][1] == '#') {b1.setVisible(false);}
            else if(laberinto[1][1]=='.'||laberinto[1][1]=='.'){b1.setVisible(true);}
            
            if (laberinto[1][2] == '#') {c1.setVisible(false);}
            else if(laberinto[1][2]=='.'||laberinto[1][2]=='.'){c1.setVisible(true);}
            
            if (laberinto[1][3] == '#') { d1.setVisible(false);}
            else if(laberinto[1][3]=='.'||laberinto[1][3]=='.'){d1.setVisible(true);}
            
            if (laberinto[1][4] == '#') { e1.setVisible(false);}
             else if(laberinto[1][4]=='.'||laberinto[1][4]=='.'){e1.setVisible(true);}
            
            if (laberinto[1][5] == '#') {f1.setVisible(false);}
            else if(laberinto[1][5]=='.'||laberinto[1][5]=='.'){f1.setVisible(true);}
            
            if (laberinto[1][6] == '#') {g1.setVisible(false);}
            else if(laberinto[1][6]=='.'||laberinto[1][6]=='.'){g1.setVisible(true);}
            
            if (laberinto[1][7] == '#') {h1.setVisible(false);}
            else if(laberinto[1][7]=='.'||laberinto[1][7]=='.'){h1.setVisible(true);}
            
            if (laberinto[1][8] == '#') {i1.setVisible(false);}
             else if(laberinto[1][8]=='.'||laberinto[1][8]=='.'){i1.setVisible(true);}
            
            
            
             if (laberinto[2][0] == '#') {a2.setVisible(false);}
            else if(laberinto[2][0]=='.'||laberinto[2][0]=='.'){a2.setVisible(true);}            
           
            if (laberinto[2][1] == '#') {b2.setVisible(false);}
            else if(laberinto[2][1]=='.'||laberinto[2][1]=='.'){b2.setVisible(true);}
            
            if (laberinto[2][2] == '#') {c2.setVisible(false);}
            else if(laberinto[2][2]=='.'||laberinto[2][2]=='.'){c2.setVisible(true);}
            
            if (laberinto[2][3] == '#') { d2.setVisible(false);}
            else if(laberinto[2][3]=='.'||laberinto[2][3]=='.'){d2.setVisible(true);}
            
            if (laberinto[2][4] == '#') { e2.setVisible(false);}
             else if(laberinto[2][4]=='.'||laberinto[2][4]=='.'){e2.setVisible(true);}
            
            if (laberinto[2][5] == '#') {f2.setVisible(false);}
            else if(laberinto[2][5]=='.'||laberinto[2][5]=='.'){f2.setVisible(true);}
            
            if (laberinto[2][6] == '#') {g2.setVisible(false);}
            else if(laberinto[2][6]=='.'||laberinto[2][6]=='.'){g2.setVisible(true);}
            
            if (laberinto[2][7] == '#') {h2.setVisible(false);}
            else if(laberinto[2][7]=='.'||laberinto[2][7]=='.'){h2.setVisible(true);}
            
            if (laberinto[2][8] == '#') {i2.setVisible(false);}
             else if(laberinto[2][8]=='.'||laberinto[2][8]=='.'){i2.setVisible(true);}
            
            
            
             if (laberinto[3][0] == '#') {a3.setVisible(false);}
            else if(laberinto[3][0]=='.'||laberinto[3][0]=='.'){a3.setVisible(true);}            
           
            if (laberinto[3][1] == '#') {b3.setVisible(false);}
            else if(laberinto[3][1]=='.'||laberinto[3][1]=='.'){b3.setVisible(true);}
            
            if (laberinto[3][2] == '#') {c3.setVisible(false);}
            else if(laberinto[3][2]=='.'||laberinto[3][2]=='.'){c3.setVisible(true);}
            
            if (laberinto[3][3] == '#') { d3.setVisible(false);}
            else if(laberinto[3][3]=='.'||laberinto[3][3]=='.'){d3.setVisible(true);}
            
            if (laberinto[3][4] == '#') { e3.setVisible(false);}
             else if(laberinto[3][4]=='.'||laberinto[3][4]=='.'){e3.setVisible(true);}
            
            if (laberinto[3][5] == '#') {f3.setVisible(false);}
            else if(laberinto[3][5]=='.'||laberinto[3][5]=='.'){f3.setVisible(true);}
            
            if (laberinto[3][6] == '#') {g3.setVisible(false);}
            else if(laberinto[3][6]=='.'||laberinto[3][6]=='.'){g3.setVisible(true);}
            
            if (laberinto[3][7] == '#') {h3.setVisible(false);}
            else if(laberinto[3][7]=='.'||laberinto[3][7]=='.'){h3.setVisible(true);}
            
            if (laberinto[3][8] == '#') {i3.setVisible(false);}
             else if(laberinto[3][8]=='.'||laberinto[3][8]=='.'){i3.setVisible(true);}
            
         

            
            
             if (laberinto[4][0] == '#') {a4.setVisible(false);}
            else if(laberinto[4][0]=='.'||laberinto[4][0]=='.'){a4.setVisible(true);}            
           
            if (laberinto[4][1] == '#') {b4.setVisible(false);}
            else if(laberinto[4][1]=='.'||laberinto[4][1]=='.'){b4.setVisible(true);}
            
            if (laberinto[4][2] == '#') {c4.setVisible(false);}
            else if(laberinto[4][2]=='.'||laberinto[4][2]=='.'){c4.setVisible(true);}
            
            if (laberinto[4][3] == '#') { d4.setVisible(false);}
            else if(laberinto[4][3]=='.'||laberinto[4][3]=='.'){d4.setVisible(true);}
            
            if (laberinto[4][4] == '#') { e4.setVisible(false);}
             else if(laberinto[4][4]=='.'||laberinto[4][4]=='.'){e4.setVisible(true);}
            
            if (laberinto[4][5] == '#') {f4.setVisible(false);}
            else if(laberinto[4][5]=='.'||laberinto[4][5]=='.'){f4.setVisible(true);}
            
            if (laberinto[4][6] == '#') {g4.setVisible(false);}
            else if(laberinto[4][6]=='.'||laberinto[4][6]=='.'){g4.setVisible(true);}
            
            if (laberinto[4][7] == '#') {h4.setVisible(false);}
            else if(laberinto[4][7]=='.'||laberinto[4][7]=='.'){h4.setVisible(true);}
            
            if (laberinto[4][8] == '#') {i4.setVisible(false);}
             else if(laberinto[4][8]=='.'||laberinto[4][8]=='.'){i4.setVisible(true);}
            
            
            
            
             if (laberinto[5][0] == '#') {a5.setVisible(false);}
            else if(laberinto[5][0]=='.'||laberinto[5][0]=='.'){a5.setVisible(true);}            
           
            if (laberinto[5][1] == '#') {b5.setVisible(false);}
            else if(laberinto[5][1]=='.'||laberinto[5][1]=='.'){b5.setVisible(true);}
            
            if (laberinto[5][2] == '#') {c5.setVisible(false);}
            else if(laberinto[5][2]=='.'||laberinto[5][2]=='.'){c5.setVisible(true);}
            
            if (laberinto[5][3] == '#') { d5.setVisible(false);}
            else if(laberinto[5][3]=='.'||laberinto[5][3]=='.'){d5.setVisible(true);}
            
            if (laberinto[5][4] == '#') { e5.setVisible(false);}
             else if(laberinto[5][4]=='.'||laberinto[5][4]=='.'){e5.setVisible(true);}
            
            if (laberinto[5][5] == '#') {f5.setVisible(false);}
            else if(laberinto[5][5]=='.'||laberinto[5][5]=='.'){f5.setVisible(true);}
            
            if (laberinto[5][6] == '#') {g5.setVisible(false);}
            else if(laberinto[5][6]=='.'||laberinto[5][6]=='.'){g5.setVisible(true);}
            
            if (laberinto[5][7] == '#') {h5.setVisible(false);}
            else if(laberinto[5][7]=='.'||laberinto[5][7]=='.'){h5.setVisible(true);}
            
            if (laberinto[5][8] == '#') {i5.setVisible(false);}
             else if(laberinto[5][8]=='.'||laberinto[5][8]=='.'){i5.setVisible(true);}
            
            
            
            
              if (laberinto[6][0] == '#') {a6.setVisible(false);}
            else if(laberinto[6][0]=='.'||laberinto[6][0]=='.'){a6.setVisible(true);}            
           
            if (laberinto[6][1] == '#') {b6.setVisible(false);}
            else if(laberinto[6][1]=='.'||laberinto[6][1]=='.'){b6.setVisible(true);}
            
            if (laberinto[6][2] == '#') {c6.setVisible(false);}
            else if(laberinto[6][2]=='.'||laberinto[6][2]=='.'){c6.setVisible(true);}
            
            if (laberinto[6][3] == '#') { d6.setVisible(false);}
            else if(laberinto[6][3]=='.'||laberinto[6][3]=='.'){d6.setVisible(true);}
            
            if (laberinto[6][4] == '#') { e6.setVisible(false);}
             else if(laberinto[6][4]=='.'||laberinto[6][4]=='.'){e6.setVisible(true);}
            
            if (laberinto[6][5] == '#') {f6.setVisible(false);}
            else if(laberinto[6][5]=='.'||laberinto[6][5]=='.'){f6.setVisible(true);}
            
            if (laberinto[6][6] == '#') {g6.setVisible(false);}
            else if(laberinto[6][6]=='.'||laberinto[6][6]=='.'){g6.setVisible(true);}
            
            if (laberinto[6][7] == '#') {h6.setVisible(false);}
            else if(laberinto[6][7]=='.'||laberinto[6][7]=='.'){h6.setVisible(true);}
            
            if (laberinto[6][8] == '#') {i6.setVisible(false);}
             else if(laberinto[6][8]=='.'||laberinto[6][8]=='.'){i6.setVisible(true);}
            
            
            
            
              if (laberinto[7][0] == '#') {a7.setVisible(false);}
            else if(laberinto[7][0]=='.'||laberinto[7][0]=='.'){a7.setVisible(true);}            
           
            if (laberinto[7][1] == '#') {b7.setVisible(false);}
            else if(laberinto[7][1]=='.'||laberinto[7][1]=='.'){b7.setVisible(true);}
            
            if (laberinto[7][2] == '#') {c7.setVisible(false);}
            else if(laberinto[7][2]=='.'||laberinto[7][2]=='.'){c7.setVisible(true);}
            
            if (laberinto[7][3] == '#') { d7.setVisible(false);}
            else if(laberinto[7][3]=='.'||laberinto[7][3]=='.'){d7.setVisible(true);}
            
            if (laberinto[7][4] == '#') { e7.setVisible(false);}
             else if(laberinto[7][4]=='.'||laberinto[7][4]=='.'){e7.setVisible(true);}
            
            if (laberinto[7][5] == '#') {f7.setVisible(false);}
            else if(laberinto[7][5]=='.'||laberinto[7][5]=='.'){f7.setVisible(true);}
            
            if (laberinto[7][6] == '#') {g7.setVisible(false);}
            else if(laberinto[7][6]=='.'||laberinto[7][6]=='.'){g7.setVisible(true);}
            
            if (laberinto[7][7] == '#') {h7.setVisible(false);}
            else if(laberinto[7][7]=='.'||laberinto[7][7]=='.'){h7.setVisible(true);}
            
            if (laberinto[7][8] == '#') {i7.setVisible(false);}
             else if(laberinto[7][8]=='.'||laberinto[7][8]=='.'){i7.setVisible(true);}
            
            
            
           // JOptionPane.showMessageDialog(null, "Se ha completado el Laberinto", "Resuelto",JOptionPane.INFORMATION_MESSAGE,icon);
            
            
        } catch (Exception e) {
            System.out.println("revasada");
        }

 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   private static char muro ='#';
   private static char prnj='.';
   private static char vcio=' ';
   
   /*Laberinto 1*/
//    public static char[][] laberinto = new char[][]{
//        {'#', '#', '#', '#', '.', '#', '#', '#', '#'},
//        {'#', ' ', ' ', ' ', ' ', '#', ' ', '#', '#'},
//        {'#', ' ', '#', '#', '#', '#', ' ', '#', '#'},
//        {'#', ' ', '#', '#', ' ', ' ', ' ', ' ', '#'},
//        {'#', ' ', ' ', '#', ' ', '#', '#', ' ', '#'},
//        {'#', ' ', '#', '#', ' ', '#', ' ', ' ', '#'},
//        {'#', ' ', ' ', ' ', ' ', '#', ' ', '#', '#'},
//        {'#', '#', '#', '#', '#', '#', vcio, '#', '#'}};
    
   /*Laberinto 2*/
    public static char[][] laberinto= new char[][]{
        {'#', '.', '#', '#', '#', '#', '#', '#', '#'},
        {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', '#', '#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', '#', '#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', '#', '#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', '#', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' '},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#'}
    
    };
   
   
   /*Laberinto 3*/
//    public static char[][] laberinto= new char[][]{
//        {muro, muro, muro, muro, muro, muro, muro,muro, muro},
//        {muro, vcio,muro, vcio, vcio, vcio, vcio, vcio, muro},
//        {muro, vcio, vcio, vcio, muro, muro, muro, vcio, vcio},
//        {muro, vcio, muro, muro, muro, vcio, muro, muro, muro},
//        {muro, vcio, vcio, vcio, vcio, vcio, vcio, vcio, muro},
//        {muro, muro,muro, muro, muro, muro, muro, vcio, muro},
//        {muro, vcio, vcio,vcio, vcio,vcio , vcio, vcio, muro},
//        {muro, prnj, muro, muro,muro, muro, muro, muro, muro}
//    
//    };

    public static void main(String args[]) {

//        char[][] laberinto = new char[][]{
//            {'#', '#', '#', '#', '.', '#', '#', '#', '#'},
//            {'#', ' ', ' ', ' ', ' ', '#', ' ', '#', '#'},
//            {'#', ' ', '#', '#', '#', '#', ' ', '#', '#'},
//            {'#', ' ', '#', '#', ' ', ' ', ' ', ' ', '#'},
//            {'#', ' ', ' ', '#', ' ', '#', '#', ' ', '#'},
//            {'#', ' ', '#', '#', ' ', '#', ' ', ' ', '#'},
//            {'#', ' ', ' ', ' ', ' ', '#', ' ', '#', '#'},
//            {'#', '#', '#', '#', '#', '#', ' ', '#', '#'}};
        System.out.println("Situacion inicial: ");
        imprime(laberinto);
        
        
        //laberinto 1  4,1
        //laberinto 2  1,1
        //laberinto 3  1,6
        resuelve(laberinto, 1, 1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Laberinto().setVisible(true);

            }

        });
    }

    public static void imprime(char[][] lab) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print(lab[i][j]);

            }
            System.out.println();
        }
    }

    public static boolean resuelve(char[][] lab, int x, int y) {
        lab[y][x] = '.';
        if (x == 0 || y == 0 || x == lab[0].length - 1
                || y == lab.length - 1) {
            System.out.println("Encontrada solucion: ");
            imprime(lab);
            return true;
        }

        if (lab[y-1][x] == ' ') {
            boolean tmp = resuelve(lab, x, y-1);
            if (tmp == true) {
                return true;
            }
        }

        if (lab[y+1][x] == ' ') {
            boolean tmp = resuelve(lab, x, y+1);
            if (tmp == true) {
                return true;
            }
        }
        if (lab[y][x-1] == ' ') {
            boolean tmp = resuelve(lab, x-1, y);
            if (tmp == true) {
                return true;
            }
        }
        if (lab[y][x+1] == ' ') {
            boolean tmp = resuelve(lab, x+1, y);
            if (tmp == true) {
                return true;
            }
        }
        
        lab[y][x] = ' ';
        
        return false;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel a0;
    public javax.swing.JLabel a1;
    public javax.swing.JLabel a2;
    public javax.swing.JLabel a3;
    public javax.swing.JLabel a4;
    public javax.swing.JLabel a5;
    public javax.swing.JLabel a6;
    public javax.swing.JLabel a7;
    public javax.swing.JLabel b0;
    public javax.swing.JLabel b1;
    public javax.swing.JLabel b2;
    public javax.swing.JLabel b3;
    public javax.swing.JLabel b4;
    public javax.swing.JLabel b5;
    public javax.swing.JLabel b6;
    public javax.swing.JLabel b7;
    public javax.swing.JLabel c0;
    public javax.swing.JLabel c1;
    public javax.swing.JLabel c2;
    public javax.swing.JLabel c3;
    public javax.swing.JLabel c4;
    public javax.swing.JLabel c5;
    public javax.swing.JLabel c6;
    public javax.swing.JLabel c7;
    public javax.swing.JLabel d0;
    public javax.swing.JLabel d1;
    public javax.swing.JLabel d2;
    public javax.swing.JLabel d3;
    public javax.swing.JLabel d4;
    public javax.swing.JLabel d5;
    public javax.swing.JLabel d6;
    public javax.swing.JLabel d7;
    public javax.swing.JLabel e0;
    public javax.swing.JLabel e1;
    public javax.swing.JLabel e2;
    public javax.swing.JLabel e3;
    public javax.swing.JLabel e4;
    public javax.swing.JLabel e5;
    public javax.swing.JLabel e6;
    public javax.swing.JLabel e7;
    public javax.swing.JLabel f0;
    public javax.swing.JLabel f1;
    public javax.swing.JLabel f2;
    public javax.swing.JLabel f3;
    public javax.swing.JLabel f4;
    public javax.swing.JLabel f5;
    public javax.swing.JLabel f6;
    public javax.swing.JLabel f7;
    public javax.swing.JLabel g0;
    public javax.swing.JLabel g1;
    public javax.swing.JLabel g2;
    public javax.swing.JLabel g3;
    public javax.swing.JLabel g4;
    public javax.swing.JLabel g5;
    public javax.swing.JLabel g6;
    public javax.swing.JLabel g7;
    public javax.swing.JLabel h0;
    public javax.swing.JLabel h1;
    public javax.swing.JLabel h2;
    public javax.swing.JLabel h3;
    public javax.swing.JLabel h4;
    public javax.swing.JLabel h5;
    public javax.swing.JLabel h6;
    public javax.swing.JLabel h7;
    public javax.swing.JLabel i0;
    public javax.swing.JLabel i1;
    public javax.swing.JLabel i2;
    public javax.swing.JLabel i3;
    public javax.swing.JLabel i4;
    public javax.swing.JLabel i5;
    public javax.swing.JLabel i6;
    public javax.swing.JLabel i7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labImage;
    private static final javax.swing.JLabel prota = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables

}
