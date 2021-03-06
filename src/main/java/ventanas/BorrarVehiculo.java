/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;

/**
 *
 * @author Jorge Fuentes
 * @author Fernanda Jara
 * @author Javier Torres
 * @author Miriam Zambrano
 */
public class BorrarVehiculo extends javax.swing.JPanel {
    
    private DefaultTableModel dfTable;
    private Object[] obj = new Object[7];
    private MenuPrincipal mp;
    /**
     * Creates new form BorrarVehiculo
     */
    public BorrarVehiculo(MenuPrincipal ventana) {
        initComponents();
        setSize(740,570);
        setLocation(0,0);
        mp = ventana;
        dfTable = new DefaultTableModel();
        dfTable.addColumn("Marca");
        dfTable.addColumn("Modelo");
        dfTable.addColumn("Patente");
        dfTable.addColumn("Color");
        dfTable.addColumn("Año");
        dfTable.addColumn("Kilometraje");
        dfTable.addColumn("Precio");
        this.tablaVehiculos.setModel(dfTable);
        cargarListadoEnTabla(mp.getArrayList());
    }

    public void cargarListadoEnTabla(ArrayList<Vehiculo> lista){
        for(int i=0; i<lista.size(); i++){
            obj[0] = lista.get(i).getMarca();
            obj[1] = lista.get(i).getModelo();
            obj[2] = lista.get(i).getPatente();
            obj[3] = lista.get(i).getColor();
            obj[4] = lista.get(i).getAnio();
            obj[5] = lista.get(i).getKilometraje();
            obj[6] = lista.get(i).getPrecio();
            dfTable.addRow(obj);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        btnBorrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatenteBorrar = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Borrar el registro de un vehículo en la sucursal");

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaVehiculos);

        btnBorrar.setBackground(new java.awt.Color(0, 153, 255));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar registro");

        javax.swing.GroupLayout btnBorrarLayout = new javax.swing.GroupLayout(btnBorrar);
        btnBorrar.setLayout(btnBorrarLayout);
        btnBorrarLayout.setHorizontalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBorrarLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
        );
        btnBorrarLayout.setVerticalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Nº PATENTE");

        txtPatenteBorrar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txtPatenteBorrar.setForeground(new java.awt.Color(51, 51, 51));
        txtPatenteBorrar.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(txtPatenteBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPatenteBorrar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        Boolean patente = false;
        for(int i=0; i < mp.getArrayList().size(); i++){
            //Compara las patentes sin importar las mayusculas o minusculas, solo compara el contenido
            if(txtPatenteBorrar.getText().equalsIgnoreCase(mp.getArrayList().get(i).getPatente())){
                patente = true;
                // Remueve de la lista el objeto vehiculo en la posicion i
                mp.getArrayList().remove(i);
                // Remueve de la tabla la fila con posicion i
                dfTable.removeRow(i);
                JOptionPane.showMessageDialog(null, "Vehículo borrado");
                txtPatenteBorrar.setText("");
            }
        }
        //Se ejecuta cuando la variable patente es false
        if(!patente){
            JOptionPane.showMessageDialog(null, "Patente no encontrada, intente nuevamente");
        }
    }//GEN-LAST:event_btnBorrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTextField txtPatenteBorrar;
    // End of variables declaration//GEN-END:variables
}
