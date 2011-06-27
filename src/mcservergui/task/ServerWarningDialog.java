/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ServerWarningDialog.java
 *
 * Created on May 28, 2011, 1:04:43 AM
 */

package mcservergui.task;

import javax.swing.SwingUtilities;

import mcservergui.listmodel.GUIListModel;
import mcservergui.tools.RegexVerifier;
import static mcservergui.tools.TimeTools.*;

/**
 *
 * @author dumptruckman
 */
public class ServerWarningDialog extends javax.swing.JDialog {

    /** Creates new form ServerWarningDialog */
    public ServerWarningDialog(java.awt.Frame parent,
            GUIListModel warningListModel/*,
            java.util.List<ServerWarning> serverWarningList*/) {
        super(parent);
        this.warningListModel = warningListModel;
        //this.serverWarningList = serverWarningList;
        borderTitle = "New Server Warning";
        initComponents();
    }

    public ServerWarningDialog(java.awt.Frame parent,
            GUIListModel warningListModel,
            /*java.util.List<ServerWarning> serverWarningList,*/
            ServerWarning oldWarning) {
        super(parent);
        this.warningListModel = warningListModel;
        //this.serverWarningList = serverWarningList;
        this.oldWarning = oldWarning;
        borderTitle = "Edit Server Warning";
        initComponents();
        addOldWarning();
        addButton.setText("Update");
    }

    @org.jdesktop.application.Action public void closeTaskDialog() {
        dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timeBeforeLabel = new javax.swing.JLabel();
        timeBeforeField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        commandIsMessage = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(borderTitle));
        jPanel1.setName("jPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mcservergui.Main.class).getContext().getResourceMap(ServerWarningDialog.class);
        timeBeforeLabel.setText(resourceMap.getString("timeBeforeLabel.text")); // NOI18N
        timeBeforeLabel.setName("timeBeforeLabel"); // NOI18N

        timeBeforeField.setText(resourceMap.getString("timeBeforeField.text")); // NOI18N
        timeBeforeField.setToolTipText(resourceMap.getString("timeBeforeField.toolTipText")); // NOI18N
        timeBeforeField.setInputVerifier(new mcservergui.tools.RegexVerifier("^(\\d{1,2}h)?\\s?(\\d{1,2}m)?\\s?(\\d{1,2}s)?$"));
        timeBeforeField.setName("timeBeforeField"); // NOI18N

        messageLabel.setText(resourceMap.getString("messageLabel.text")); // NOI18N
        messageLabel.setName("messageLabel"); // NOI18N

        messageField.setText(resourceMap.getString("messageField.text")); // NOI18N
        messageField.setToolTipText(resourceMap.getString("messageField.toolTipText")); // NOI18N
        messageField.setName("messageField"); // NOI18N
        messageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageFieldActionPerformed(evt);
            }
        });

        addButton.setText(resourceMap.getString("addButton.text")); // NOI18N
        addButton.setName("addButton"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        commandIsMessage.setText(resourceMap.getString("commandIsMessage.text")); // NOI18N
        commandIsMessage.setName("commandIsMessage"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(timeBeforeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeBeforeField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(messageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commandIsMessage))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(cancelButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeBeforeLabel)
                    .addComponent(timeBeforeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageLabel)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandIsMessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(addButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(this,
                    "Are you sure you wish to cancel?\n",
                    "Alert",
                    javax.swing.JOptionPane.YES_NO_OPTION) ==
                    javax.swing.JOptionPane.YES_OPTION) {
            closeTaskDialog();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        closeAndAdd();
    }//GEN-LAST:event_addButtonActionPerformed

    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageFieldActionPerformed
        closeAndAdd();
    }//GEN-LAST:event_messageFieldActionPerformed

    private void addOldWarning() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                timeBeforeField.setText(hmsFromSeconds(oldWarning.getTime()));
                String command = oldWarning.getMessage();
                if (command.startsWith("say ")) {
                    command = command.replaceFirst("say ", "");
                    commandIsMessage.setSelected(true);
                }
                messageField.setText(command);
            }
        });
    }

    private void closeAndAdd() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                if ((!timeBeforeField.getInputVerifier().verify(timeBeforeField)) ||
                        (timeBeforeField.getText().isEmpty())) {
                    timeBeforeField.requestFocus();
                } else {
                    int seconds = secondsFromHms(timeBeforeField.getText());

                    if (oldWarning != null) {
                        warningListModel.removeElement(oldWarning);
                        //warningListModel.removeElement(oldWarning.toString());
                        //serverWarningList.remove(oldWarning);
                    }

                    String command = messageField.getText();
                    if (commandIsMessage.isSelected()) {
                        command = "say " + command;
                    }
                    //serverWarningList.add(new ServerWarning(
                    //        command,seconds));
                    warningListModel.add(new ServerWarning(
                            command,seconds));
                    closeTaskDialog();
                }
            }
        });
    }

    private GUIListModel warningListModel;
    //private java.util.List<ServerWarning> serverWarningList;
    private ServerWarning oldWarning;
    private String borderTitle;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox commandIsMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField timeBeforeField;
    private javax.swing.JLabel timeBeforeLabel;
    // End of variables declaration//GEN-END:variables

}
