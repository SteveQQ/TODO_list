import com.steveq.controller.ListController;
import com.steveq.view.TodoGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * Created by SteveQ on 2016-10-07.
 */
public class Main {

    private ListController controller = ListController.getInstance();

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TodoGui tgui = new TodoGui();
                tgui.setVisible(true);
                tgui.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        int option = JOptionPane.showConfirmDialog(tgui, "Are you sure to exit?", "", JOptionPane.YES_NO_OPTION);
                        if(option == JOptionPane.YES_OPTION){
                            System.exit(1);
                        }
                    }
                });
//                tgui.jMenuItem1.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                            JFileChooser fc = new JFileChooser();
//                            int returnVal = fc.showSaveDialog(tgui);
//                            if(returnVal == JFileChooser.APPROVE_OPTION){
//                                File file = fc.getSelectedFile();
//                                System.out.println(file);
//                                controller.setFile(file);
//                            }
//                    }
//                });
            }
        });
    }


}
