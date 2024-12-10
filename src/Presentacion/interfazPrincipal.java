package Presentacion;

import java.awt.BorderLayout;
import java.util.Locale;

public class interfazPrincipal extends javax.swing.JFrame {

   public interfazPrincipal() {
        initComponents();
        content.setLayout(new BorderLayout());
        
        interfazInicio pagInicio = new interfazInicio();
        pagInicio.setSize(860,500);
        pagInicio.setLocation(0,0);

        content.removeAll();
        content.add(pagInicio, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
  
        propiedadesBotones();
    }

    // Método público para cambiar entre paneles
    public void cambiarPanel(javax.swing.JPanel nuevoPanel) {
        nuevoPanel.setSize(860, 500);
        nuevoPanel.setLocation(0, 0);

        content.removeAll();
        content.add(nuevoPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnTransaciones = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setPreferredSize(new java.awt.Dimension(1050, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banner.setBackground(new java.awt.Color(0, 0, 255));
        banner.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bannerAPI.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 90));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        bg.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        opciones.setBackground(new java.awt.Color(25, 80, 180));

        btnInicio.setBackground(new java.awt.Color(25, 80, 180));
        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png")))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(10);
        btnInicio.setName(""); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(25, 80, 180));
        btnProveedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        btnProveedor.setText("PROVEEDORES");
        btnProveedor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png")))); // NOI18N
        btnProveedor.setBorderPainted(false);
        btnProveedor.setContentAreaFilled(false);
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.setFocusPainted(false);
        btnProveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedor.setIconTextGap(10);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(25, 80, 180));
        btnUsuarios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png")))); // NOI18N
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(10);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(25, 80, 180));
        btnProducto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        btnProducto.setText("PRODUCTOS");
        btnProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnProducto.setBorderPainted(false);
        btnProducto.setContentAreaFilled(false);
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.setFocusPainted(false);
        btnProducto.setHideActionText(true);
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProducto.setIconTextGap(10);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnTransaciones.setBackground(new java.awt.Color(25, 80, 180));
        btnTransaciones.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnTransaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnTransaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transaccion.png"))); // NOI18N
        btnTransaciones.setText("TRANSACCIONES");
        btnTransaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png")))); // NOI18N
        btnTransaciones.setBorderPainted(false);
        btnTransaciones.setContentAreaFilled(false);
        btnTransaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransaciones.setFocusPainted(false);
        btnTransaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTransaciones.setIconTextGap(10);
        btnTransaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransacionesActionPerformed(evt);
            }
        });

        btnCategorias.setBackground(new java.awt.Color(25, 80, 180));
        btnCategorias.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/laboratorio.png"))); // NOI18N
        btnCategorias.setText("CATEGORIAS");
        btnCategorias.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png")))); // NOI18N
        btnCategorias.setBorderPainted(false);
        btnCategorias.setContentAreaFilled(false);
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategorias.setFocusPainted(false);
        btnCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCategorias.setIconTextGap(10);
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        btnEstadisticas.setBackground(new java.awt.Color(25, 80, 180));
        btnEstadisticas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transaccion.png"))); // NOI18N
        btnEstadisticas.setActionCommand("ESTADISTICAS");
        btnEstadisticas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png")))); // NOI18N
        btnEstadisticas.setBorderPainted(false);
        btnEstadisticas.setContentAreaFilled(false);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadisticas.setIconTextGap(10);
        btnEstadisticas.setLabel("ESTADISTICAS");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(btnTransaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTransaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        bg.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 500));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 860, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        interfazUsuario pagUsuarios = new interfazUsuario();

        pagUsuarios.setSize(860,500);
        pagUsuarios.setLocation(0,0);

        content.removeAll();
        content.add(pagUsuarios, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        interfazProveedores pagProveedores = new interfazProveedores();

        pagProveedores.setSize(860,500);
        pagProveedores.setLocation(0,0);

        content.removeAll();
        content.add(pagProveedores, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnTransacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransacionesActionPerformed
        interfaztransaccion pagProveedores = new interfaztransaccion();

        pagProveedores.setSize(860,500);
        pagProveedores.setLocation(0,0);

        content.removeAll();
        content.add(pagProveedores, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnTransacionesActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
interfazCategoria pagCategoria = new interfazCategoria(this);

        pagCategoria .setSize(860,500);
        pagCategoria .setLocation(0,0);

        content.removeAll();
        content.add(pagCategoria , BorderLayout.CENTER);
        content.revalidate();
        content.repaint();        
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        interfazProductos pagProductos = new interfazProductos();

        pagProductos .setSize(860,600);
        pagProductos .setLocation(0,0);
        
        content.removeAll();
        content.add(pagProductos , BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        interfazInicio pagInicio = new interfazInicio(this);

        pagInicio .setSize(860,500);
        pagInicio .setLocation(0,0);

        content.removeAll();
        content.add(pagInicio , BorderLayout.CENTER);
        content.revalidate();
        content.repaint();   
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
        interfazEstadisticas pagEstadistica = new interfazEstadisticas();

        pagEstadistica .setSize(860,600);
        pagEstadistica .setLocation(0,0);
        
        content.removeAll();
        content.add(pagEstadistica , BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnEstadisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnTransaciones;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables

    private void propiedadesBotones(){
        
        //Boton inicio
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnInicio.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnInicio.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnInicio.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
        
        //Boton Producto
        
        btnProducto.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnProducto.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnProducto.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnProducto.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
        // Boton proveedor
        btnProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnProveedor.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnProveedor.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnProveedor.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
        //Boton usuario
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnUsuarios.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnUsuarios.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnUsuarios.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
       //Boton Laboratorio
        
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnCategorias.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnCategorias.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnCategorias.setBackground(new java.awt.Color(25, 80, 180)); // Color original
            
        }
    });
        //Boton proveedores
        
        btnProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnProveedor.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnProveedor.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnProveedor.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
    
        
        //Boton Transaciones
        
        btnTransaciones.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnTransaciones.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnTransaciones.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnTransaciones.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
    
    
    }


}
