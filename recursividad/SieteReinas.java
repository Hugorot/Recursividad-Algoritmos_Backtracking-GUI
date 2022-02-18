/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 * Codigo practico, GUI y Ficheros.
 * Universidad Catolica Santiago de Guayaquil.
 * @author PC
 */
public final class SieteReinas extends javax.swing.JFrame {
     public static boolean colocarReina(int[][] t, int fila) {
        if (fila == DIMENSION) {
            System.out.println("Solucion");
            imprimir(t);
            return true;
        }
        for (int columna = 0; columna < DIMENSION; columna++) {
            if (!amenazada(t, fila, columna)) {
                t[fila][columna] = fila + 1;
                boolean tmp = colocarReina(t, fila + 1);
                if (tmp == true) {
                    return true;
                }
                t[fila][columna] = 0;
            }
        }

        return false;
    }

    private static void imprimir(int[][] lab) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print(lab[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean amenazada(int[][] t, int fila, int columna) {
        for (int i = 0; i < DIMENSION; i++) {
            if (t[fila][i] != 0 || t[i][columna] != 0) {
                return true;
            }
        }
        for (int f = fila, c = columna; f >= 0 && c >= 0; f--, c--) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }

        for (int f = fila, c = columna; f >= 0 && c < DIMENSION; f--, c++) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }

        for (int f = fila, c = columna; f < DIMENSION && c >= 0; f++, c--) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }

        }

        for (int f = fila, c = columna; f < DIMENSION && c < DIMENSION; f++, c++) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }

        return false;
    }
 

    /**
     * @param args the command line arguments
     */
    
    /**
     * Creates new form SieteReinas
     */
    public SieteReinas() {
        initComponents();
        ocultar();
    }
  public void ocultar() {
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);
        a7.setVisible(false);
        a8.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        c8.setVisible(false);
        d1.setVisible(false);
        d2.setVisible(false);
        d3.setVisible(false);
        d4.setVisible(false);
        d5.setVisible(false);
        d6.setVisible(false);
        d7.setVisible(false);
        d8.setVisible(false);
        e1.setVisible(false);
        e2.setVisible(false);
        e3.setVisible(false);
        e4.setVisible(false);;
        e5.setVisible(false);
        e6.setVisible(false);
        e7.setVisible(false);
        e8.setVisible(false);
        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
        f6.setVisible(false);
        f7.setVisible(false);
        f8.setVisible(false);
        g1.setVisible(false);
        g2.setVisible(false);
        g3.setVisible(false);
        g4.setVisible(false);
        g5.setVisible(false);
        g6.setVisible(false);
        g7.setVisible(false);
        g8.setVisible(false);
        h1.setVisible(false);
        h2.setVisible(false);
        h3.setVisible(false);
        h4.setVisible(false);
        h5.setVisible(false);
        h6.setVisible(false);
        h7.setVisible(false);
        h8.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        f6 = new javax.swing.JLabel();
        f7 = new javax.swing.JLabel();
        f8 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        g6 = new javax.swing.JLabel();
        g7 = new javax.swing.JLabel();
        g8 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        h8 = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("7 Reinas");
        setMaximumSize(new java.awt.Dimension(478, 509));
        setMinimumSize(new java.awt.Dimension(478, 509));
        getContentPane().setLayout(null);

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a1);
        a1.setBounds(50, 360, 40, 40);

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a2);
        a2.setBounds(50, 310, 40, 40);

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a3);
        a3.setBounds(50, 270, 40, 40);

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a4);
        a4.setBounds(50, 220, 40, 40);

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a5);
        a5.setBounds(50, 180, 40, 40);

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a6);
        a6.setBounds(50, 130, 40, 40);

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a7);
        a7.setBounds(50, 90, 40, 40);

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(a8);
        a8.setBounds(50, 40, 40, 40);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b1);
        b1.setBounds(100, 360, 40, 40);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b2);
        b2.setBounds(100, 310, 40, 40);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b3);
        b3.setBounds(100, 270, 40, 40);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b4);
        b4.setBounds(100, 220, 40, 40);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b5);
        b5.setBounds(100, 180, 40, 40);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b6);
        b6.setBounds(100, 130, 40, 40);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b7);
        b7.setBounds(100, 90, 40, 40);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(b8);
        b8.setBounds(100, 40, 40, 40);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c1);
        c1.setBounds(140, 360, 40, 40);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c2);
        c2.setBounds(140, 310, 40, 40);

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c3);
        c3.setBounds(140, 270, 40, 40);

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c4);
        c4.setBounds(140, 220, 40, 40);

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c5);
        c5.setBounds(140, 180, 40, 40);

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c6);
        c6.setBounds(140, 130, 40, 40);

        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c7);
        c7.setBounds(140, 90, 40, 40);

        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(c8);
        c8.setBounds(140, 40, 40, 40);

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d1);
        d1.setBounds(190, 360, 40, 40);

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d2);
        d2.setBounds(190, 310, 40, 40);

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d3);
        d3.setBounds(190, 270, 40, 40);

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d4);
        d4.setBounds(190, 220, 40, 40);

        d5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d5);
        d5.setBounds(190, 180, 40, 40);

        d6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d6);
        d6.setBounds(190, 130, 40, 40);

        d7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d7);
        d7.setBounds(190, 90, 40, 40);

        d8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(d8);
        d8.setBounds(190, 40, 40, 40);

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e1);
        e1.setBounds(230, 360, 40, 40);

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e2);
        e2.setBounds(230, 310, 40, 40);

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e3);
        e3.setBounds(230, 270, 40, 40);

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e4);
        e4.setBounds(230, 220, 40, 40);

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e5);
        e5.setBounds(230, 180, 40, 40);

        e6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e6);
        e6.setBounds(230, 130, 40, 40);

        e7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e7);
        e7.setBounds(230, 90, 40, 40);

        e8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(e8);
        e8.setBounds(230, 40, 40, 40);

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f1.setText("jLabel2");
        getContentPane().add(f1);
        f1.setBounds(280, 360, 40, 40);

        f2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f2.setText("jLabel2");
        getContentPane().add(f2);
        f2.setBounds(280, 310, 40, 40);

        f3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f3.setText("jLabel2");
        getContentPane().add(f3);
        f3.setBounds(280, 270, 40, 40);

        f4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f4.setText("jLabel2");
        getContentPane().add(f4);
        f4.setBounds(280, 220, 40, 40);

        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f5.setText("jLabel2");
        getContentPane().add(f5);
        f5.setBounds(280, 180, 40, 40);

        f6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f6.setText("jLabel2");
        getContentPane().add(f6);
        f6.setBounds(280, 130, 40, 40);

        f7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f7.setText("jLabel2");
        getContentPane().add(f7);
        f7.setBounds(280, 90, 40, 40);

        f8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        f8.setText("jLabel2");
        getContentPane().add(f8);
        f8.setBounds(280, 40, 40, 40);

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g1);
        g1.setBounds(320, 360, 50, 40);

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g2);
        g2.setBounds(320, 310, 50, 40);

        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g3);
        g3.setBounds(320, 270, 50, 40);

        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g4);
        g4.setBounds(320, 220, 50, 40);

        g5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g5);
        g5.setBounds(320, 180, 50, 40);

        g6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g6);
        g6.setBounds(320, 130, 50, 40);

        g7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g7);
        g7.setBounds(320, 80, 50, 40);

        g8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(g8);
        g8.setBounds(320, 40, 50, 40);

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h1);
        h1.setBounds(370, 360, 40, 40);

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h2);
        h2.setBounds(370, 310, 40, 40);

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h3);
        h3.setBounds(370, 270, 40, 40);

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h4);
        h4.setBounds(370, 220, 40, 40);

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h5);
        h5.setBounds(370, 180, 40, 40);

        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h6);
        h6.setBounds(370, 130, 40, 40);

        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h7);
        h7.setBounds(370, 80, 40, 40);

        h8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reina-negra.png"))); // NOI18N
        getContentPane().add(h8);
        h8.setBounds(370, 40, 40, 40);

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tablero.png"))); // NOI18N
        getContentPane().add(tablero);
        tablero.setBounds(31, 18, 400, 400);

        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 440, 90, 30);

        jButton2.setText("Resolver");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(121, 440, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //FILA NUMERO 1

        if (t[0][0] == 1 || t[0][0] == 2 || t[0][0] == 3 || t[0][0] == 4 || t[0][0] == 5 || t[0][0] == 6 || t[0][0] == 7 || t[0][0] == 8) {
            a8.setVisible(true);
        }
        if (t[0][1] == 1 || t[0][1] == 2 || t[0][1] == 3 || t[0][1] == 4 || t[0][1] == 5 || t[0][1] == 6 || t[0][1] == 7 || t[0][1] == 8) {
            b8.setVisible(true);
        }

        if (t[0][2] == 1 || t[0][2] == 2 || t[0][2] == 3 || t[0][2] == 4 || t[0][2] == 5 || t[0][2] == 6 || t[0][2] == 7 || t[0][2] == 8) {
            c8.setVisible(true);
        }
        if (t[0][3] == 1 || t[0][3] == 2 || t[0][3] == 3 || t[0][3] == 4 || t[0][3] == 5 || t[0][3] == 6 || t[0][3] == 7 || t[0][3] == 8) {
            d8.setVisible(true);
        }
        if (t[0][4] == 1 || t[0][4] == 2 || t[0][4] == 3 || t[0][4] == 4 || t[0][4] == 5 || t[0][4] == 6 || t[0][4] == 7 || t[0][4] == 8) {
            e8.setVisible(true);
        }
        if (t[0][5] == 1 || t[0][5] == 2 || t[0][5] == 3 || t[0][5] == 4 || t[0][5] == 5 || t[0][5] == 6 || t[0][5] == 7 || t[0][5] == 8) {
            f8.setVisible(true);
        }
        if (t[0][6] == 1 || t[0][6] == 2 || t[0][6] == 3 || t[0][6] == 4 || t[0][6] == 5 || t[0][6] == 6 || t[0][6] == 7 || t[0][6] == 8) {
            g8.setVisible(true);
        }
        //        if (t[0][7] == 1 || t[0][7] == 2 || t[0][7] == 3 || t[0][7] == 4 || t[0][7] == 5 || t[0][7] == 6 || t[0][7] == 7 || t[0][7] == 8) {
            //            h8.setVisible(true);
            //        }
        //

        //FILA NUMERO 2

        if (t[1][0] == 1 || t[1][0] == 2 || t[1][0] == 3 || t[1][0] == 4 || t[1][0] == 5 || t[1][0] == 6 || t[1][0] == 7 || t[1][0] == 8) {
            a7.setVisible(true);
        }
        if (t[1][1] == 1 || t[1][1] == 2 || t[1][1] == 3 || t[1][1] == 4 || t[1][1] == 5 || t[1][1] == 6 || t[1][1] == 7 || t[1][1] == 8) {
            b7.setVisible(true);
        }

        if (t[1][2] == 1 || t[1][2] == 2 || t[1][2] == 3 || t[1][2] == 4 || t[1][2] == 5 || t[1][2] == 6 || t[1][2] == 7 || t[1][2] == 8) {
            c7.setVisible(true);
        }
        if (t[1][3] == 1 || t[1][3] == 2 || t[1][3] == 3 || t[1][3] == 4 || t[1][3] == 5 || t[1][3] == 6 || t[1][3] == 7 || t[1][3] == 8) {
            d7.setVisible(true);
        }
        if (t[1][4] == 1 || t[1][4] == 2 || t[1][4] == 3 || t[1][4] == 4 || t[1][4] == 5 || t[1][4] == 6 || t[1][4] == 7 || t[1][4] == 8) {
            e7.setVisible(true);
        }
        if (t[1][5] == 1 || t[1][5] == 2 || t[1][5] == 3 || t[1][5] == 4 || t[1][5] == 5 || t[1][5] == 6 || t[1][5] == 7 || t[1][5] == 8) {
            f7.setVisible(true);
        }
        if (t[1][6] == 1 || t[1][6] == 2 || t[1][6] == 3 || t[1][6] == 4 || t[1][6] == 5 || t[1][6] == 6 || t[1][6] == 7 || t[1][6] == 8) {
            g7.setVisible(true);
        }
        //        if (t[1][7] == 1 || t[1][7] == 2 || t[1][7] == 3 || t[1][7] == 4 || t[1][7] == 5 || t[1][7] == 6 || t[1][7] == 7 || t[1][7] == 8) {
            //            h7.setVisible(true);
            //        }
        //

        //FILA NUMERO 3

        if (t[2][0] == 1 || t[2][0] == 2 || t[2][0] == 3 || t[2][0] == 4 || t[2][0] == 5 || t[2][0] == 6 || t[2][0] == 7 || t[2][0] == 8) {
            a6.setVisible(true);
        }
        if (t[2][1] == 1 || t[2][1] == 2 || t[2][1] == 3 || t[2][1] == 4 || t[2][1] == 5 || t[2][1] == 6 || t[2][1] == 7 || t[2][1] == 8) {
            b6.setVisible(true);
        }

        if (t[2][2] == 1 || t[2][2] == 2 || t[2][2] == 3 || t[2][2] == 4 || t[2][2] == 5 || t[2][2] == 6 || t[2][2] == 7 || t[2][2] == 8) {
            c6.setVisible(true);
        }
        if (t[2][3] == 1 || t[2][3] == 2 || t[2][3] == 3 || t[2][3] == 4 || t[2][3] == 5 || t[2][3] == 6 || t[2][3] == 7 || t[2][3] == 8) {
            d6.setVisible(true);
        }
        if (t[2][4] == 1 || t[2][4] == 2 || t[2][4] == 3 || t[2][4] == 4 || t[2][4] == 5 || t[2][4] == 6 || t[2][4] == 7 || t[2][4] == 8) {
            e6.setVisible(true);
        }
        if (t[2][5] == 1 || t[2][5] == 2 || t[2][5] == 3 || t[2][5] == 4 || t[2][5] == 5 || t[2][5] == 6 || t[2][5] == 7 || t[2][5] == 8) {
            f6.setVisible(true);
        }
        if (t[2][6] == 1 || t[2][6] == 2 || t[2][6] == 3 || t[2][6] == 4 || t[2][6] == 5 || t[2][6] == 6 || t[2][6] == 7 || t[2][6] == 8) {
            g6.setVisible(true);
        }
        //        if (t[2][7] == 1 || t[2][7] == 2 || t[2][7] == 3 || t[2][7] == 4 || t[2][7] == 5 || t[2][7] == 6 || t[2][7] == 7 || t[2][7] == 8) {
            //            h6.setVisible(true);
            //        }

        //FILA NUMERO 4

        if (t[3][0] == 1 || t[3][0] == 2 || t[3][0] == 3 || t[3][0] == 4 || t[3][0] == 5 || t[3][0] == 6 || t[3][0] == 7 || t[3][0] == 8) {
            a5.setVisible(true);
        }
        if (t[3][1] == 1 || t[3][1] == 2 || t[3][1] == 3 || t[3][1] == 4 || t[3][1] == 5 || t[3][1] == 6 || t[3][1] == 7 || t[3][1] == 8) {
            b5.setVisible(true);
        }

        if (t[3][2] == 1 || t[3][2] == 2 || t[3][2] == 3 || t[3][2] == 4 || t[3][2] == 5 || t[3][2] == 6 || t[3][2] == 7 || t[3][2] == 8) {
            c5.setVisible(true);
        }
        if (t[3][3] == 1 || t[3][3] == 2 || t[3][3] == 3 || t[3][3] == 4 || t[3][3] == 5 || t[3][3] == 6 || t[3][3] == 7 || t[3][3] == 8) {
            d5.setVisible(true);
        }
        if (t[3][4] == 1 || t[3][4] == 2 || t[3][4] == 3 || t[3][4] == 4 || t[3][4] == 5 || t[3][4] == 6 || t[3][4] == 7 || t[3][4] == 8) {
            e5.setVisible(true);
        }
        if (t[3][5] == 1 || t[3][5] == 2 || t[3][5] == 3 || t[3][5] == 4 || t[3][5] == 5 || t[3][5] == 6 || t[3][5] == 7 || t[3][5] == 8) {
            f5.setVisible(true);
        }
        if (t[3][6] == 1 || t[3][6] == 2 || t[3][6] == 3 || t[3][6] == 4 || t[3][6] == 5 || t[3][6] == 6 || t[3][6] == 7 || t[3][6] == 8) {
            g5.setVisible(true);
        }
        //        if (t[3][7] == 1 || t[3][7] == 2 || t[3][7] == 3 || t[3][7] == 4 || t[3][7] == 5 || t[3][7] == 6 || t[3][7] == 7 || t[3][7] == 8) {
            //            h5.setVisible(true);
            //        }

        //FILA NUMERO 5

        if (t[4][0] == 1 || t[4][0] == 2 || t[4][0] == 3 || t[4][0] == 4 || t[4][0] == 5 || t[4][0] == 6 || t[4][0] == 7 || t[4][0] == 8) {
            a4.setVisible(true);
        }
        if (t[4][1] == 1 || t[4][1] == 2 || t[4][1] == 3 || t[4][1] == 4 || t[4][1] == 5 || t[4][1] == 6 || t[4][1] == 7 || t[4][1] == 8) {
            b4.setVisible(true);
        }

        if (t[4][2] == 1 || t[4][2] == 2 || t[4][2] == 3 || t[4][2] == 4 || t[4][2] == 5 || t[4][2] == 6 || t[4][2] == 7 || t[4][2] == 8) {
            c4.setVisible(true);
        }
        if (t[4][3] == 1 || t[4][3] == 2 || t[4][3] == 3 || t[4][3] == 4 || t[4][3] == 5 || t[4][3] == 6 || t[4][3] == 7 || t[4][3] == 8) {
            d4.setVisible(true);
        }
        if (t[4][4] == 1 || t[4][4] == 2 || t[4][4] == 3 || t[4][4] == 4 || t[4][4] == 5 || t[4][4] == 6 || t[4][4] == 7 || t[4][4] == 8) {
            e4.setVisible(true);
        }
        if (t[4][5] == 1 || t[4][5] == 2 || t[4][5] == 3 || t[4][5] == 4 || t[4][5] == 5 || t[4][5] == 6 || t[4][5] == 7 || t[4][5] == 8) {
            f4.setVisible(true);
        }
        if (t[4][6] == 1 || t[4][6] == 2 || t[4][6] == 3 || t[4][6] == 4 || t[4][6] == 5 || t[4][6] == 6 || t[4][6] == 7 || t[4][6] == 8) {
            g4.setVisible(true);
        }
        //        if (t[4][7] == 1 || t[4][7] == 2 || t[4][7] == 3 || t[4][7] == 4 || t[4][7] == 5 || t[4][7] == 6 || t[4][7] == 7 || t[4][7] == 8) {
            //            h4.setVisible(true);
            //        }

        //FILA NUMERO 6

        if (t[5][0] == 1 || t[5][0] == 2 || t[5][0] == 3 || t[5][0] == 4 || t[5][0] == 5 || t[5][0] == 6 || t[5][0] == 7 || t[5][0] == 8) {
            a3.setVisible(true);
        }
        if (t[5][1] == 1 || t[5][1] == 2 || t[5][1] == 3 || t[5][1] == 4 || t[5][1] == 5 || t[5][1] == 6 || t[5][1] == 7 || t[5][1] == 8) {
            b3.setVisible(true);
        }

        if (t[5][2] == 1 || t[5][2] == 2 || t[5][2] == 3 || t[5][2] == 4 || t[5][2] == 5 || t[5][2] == 6 || t[5][2] == 7 || t[5][2] == 8) {
            c3.setVisible(true);
        }
        if (t[5][3] == 1 || t[5][3] == 2 || t[5][3] == 3 || t[5][3] == 4 || t[5][3] == 5 || t[5][3] == 6 || t[5][3] == 7 || t[5][3] == 8) {
            d3.setVisible(true);
        }
        if (t[5][4] == 1 || t[5][4] == 2 || t[5][4] == 3 || t[5][4] == 4 || t[5][4] == 5 || t[5][4] == 6 || t[5][4] == 7 || t[5][4] == 8) {
            e3.setVisible(true);
        }
        if (t[5][5] == 1 || t[5][5] == 2 || t[5][5] == 3 || t[5][5] == 4 || t[5][5] == 5 || t[5][5] == 6 || t[5][5] == 7 || t[5][5] == 8) {
            f3.setVisible(true);
        }
        if (t[5][6] == 1 || t[5][6] == 2 || t[5][6] == 3 || t[5][6] == 4 || t[5][6] == 5 || t[5][6] == 6 || t[5][6] == 7 || t[5][6] == 8) {
            g3.setVisible(true);
        }
        //        if (t[5][7] == 1 || t[5][7] == 2 || t[5][7] == 3 || t[5][7] == 4 || t[5][7] == 5 || t[5][7] == 6 || t[5][7] == 7 || t[5][7] == 8) {
            //            h3.setVisible(true);
            //        }
        //

        //FILA NUMERO 7

        if (t[6][0] == 1 || t[6][0] == 2 || t[6][0] == 3 || t[6][0] == 4 || t[6][0] == 5 || t[6][0] == 6 || t[6][0] == 7 || t[6][0] == 8) {
            a2.setVisible(true);
        }
        if (t[6][1] == 1 || t[6][1] == 2 || t[6][1] == 3 || t[6][1] == 4 || t[6][1] == 5 || t[6][1] == 6 || t[6][1] == 7 || t[6][1] == 8) {
            b2.setVisible(true);
        }

        if (t[6][2] == 1 || t[6][2] == 2 || t[6][2] == 3 || t[6][2] == 4 || t[6][2] == 5 || t[6][2] == 6 || t[6][2] == 7 || t[6][2] == 8) {
            c2.setVisible(true);
        }
        if (t[6][3] == 1 || t[6][3] == 2 || t[6][3] == 3 || t[6][3] == 4 || t[6][3] == 5 || t[6][3] == 6 || t[6][3] == 7 || t[6][3] == 8) {
            d2.setVisible(true);
        }
        if (t[6][4] == 1 || t[6][4] == 2 || t[6][4] == 3 || t[6][4] == 4 || t[6][4] == 5 || t[6][4] == 6 || t[6][4] == 7 || t[6][4] == 8) {
            e2.setVisible(true);
        }
        if (t[6][5] == 1 || t[6][5] == 2 || t[6][5] == 3 || t[6][5] == 4 || t[6][5] == 5 || t[6][5] == 6 || t[6][5] == 7 || t[6][5] == 8) {
            f2.setVisible(true);
        }
        if (t[6][6] == 1 || t[6][6] == 2 || t[6][6] == 3 || t[6][6] == 4 || t[6][6] == 5 || t[6][6] == 6 || t[6][6] == 7 || t[6][6] == 8) {
            g2.setVisible(true);
        }
        //        if (t[6][7] == 1 || t[6][7] == 2 || t[6][7] == 3 || t[6][7] == 4 || t[6][7] == 5 || t[6][7] == 6 || t[6][7] == 7 || t[6][7] == 8) {
            //            h2.setVisible(true);
            //        }
        //

        //FILA NUMERO 8

        //          if (t[7][0] == 1 || t[7][0] == 2 || t[7][0] == 3 || t[7][0] == 4 || t[7][0] == 5 || t[7][0] == 6 || t[7][0] == 7 || t[7][0] == 8) {
            //            a1.setVisible(true);
            //        }
        //        if (t[7][1] == 1 || t[7][1] == 2 || t[7][1] == 3 || t[7][1] == 4 || t[7][1] == 5 || t[7][1] == 6 || t[7][1] == 7 || t[7][1] == 8) {
            //            b1.setVisible(true);
            //        }
        //
        //        if (t[7][2] == 1 || t[7][2] == 2 || t[7][2] == 3 || t[7][2] == 4 || t[7][2] == 5 || t[7][2] == 6 || t[7][2] == 7 || t[7][2] == 8) {
            //            c1.setVisible(true);
            //        }
        //        if (t[7][3] == 1 || t[7][3] == 2 || t[7][3] == 3 || t[7][3] == 4 || t[7][3] == 5 || t[7][3] == 6 || t[7][3] == 7 || t[7][3] == 8) {
            //            d1.setVisible(true);
            //        }
        //        if (t[7][4] == 1 || t[7][4] == 2 || t[7][4] == 3 || t[7][4] == 4 || t[7][4] == 5 || t[7][4] == 6 || t[7][4] == 7 || t[7][4] == 8) {
            //            e1.setVisible(true);
            //        }
        //        if (t[7][5] == 1 || t[7][5] == 2 || t[7][5] == 3 || t[7][5] == 4 || t[7][5] == 5 || t[7][5] == 6 || t[7][5] == 7 || t[7][5] == 8) {
            //            f1.setVisible(true);
            //        }
        //        if (t[7][6] == 1 || t[7][6] == 2 || t[7][6] == 3 || t[7][6] == 4 || t[7][6] == 5 || t[7][6] == 6 || t[7][6] == 7 || t[7][6] == 8) {
            //            g1.setVisible(true);
            //        }
        //        if (t[7][7] == 1 || t[7][7] == 2 || t[7][7] == 3 || t[7][7] == 4 || t[7][7] == 5 || t[7][7] == 6 || t[7][7] == 7 || t[7][7] == 8) {
            //            h1.setVisible(true);
            //        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

      private static final int DIMENSION = 7;
    private static int[][] t = new int[DIMENSION][];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SieteReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SieteReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SieteReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SieteReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SieteReinas().setVisible(true);
            }
        });
        
           for (int i = 0; i < DIMENSION; i++) {
            t[i] = new int[DIMENSION];
        }
        colocarReina(t, 0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel f5;
    private javax.swing.JLabel f6;
    private javax.swing.JLabel f7;
    private javax.swing.JLabel f8;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g5;
    private javax.swing.JLabel g6;
    private javax.swing.JLabel g7;
    private javax.swing.JLabel g8;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h5;
    private javax.swing.JLabel h6;
    private javax.swing.JLabel h7;
    private javax.swing.JLabel h8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel tablero;
    // End of variables declaration//GEN-END:variables
}
