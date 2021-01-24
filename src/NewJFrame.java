
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
jpanel ne anlama gelir ? 
JPanel direkt olarak bizim elementlerimizi barındıran bir container görevi görüyor
Biz bir jFrame'e istediğimiz sayıda JPanel koyabiliyoruz.bu JPaneller içerisine değişik butonlarımızı ve değişik textfiledlarımızı ekleyebiliyoruz.
Bunlar ayrı ayrı container görevi görüyor.Gelişmiş Uygulamalarda çok fazla kullanılan bir yöntem çünkü bazı frameler tek bir işlemi yapıyor.
JPanellerle bunları modüllerler ayırıp bu modüller sayesinde farklı butonlarınızı belirli bir panele başka butonları başka panele ekleyebiliyorum.

*/
//anaekran üzerinde user (Kullanıcılarım ve parolalarımı saklamam için bir adet class yazmam işlemlerimi kolaylaştıracak)
class User{
    private String kullanıcı_adı ;
    private String parola ;

    public User(String kullanıcı_adı, String parola) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    //burada userlarımı saklayacak bir arraylist oluşturmam gerek
    //arrayliste her yapımın ulaşabilmesi için static bir yapıda tanımlamam gerekiyor.
}
public class NewJFrame extends javax.swing.JFrame {
private static ArrayList<User> user_list = new ArrayList<User>();
//Userlist tanımlama işlemini gerçekleştirdim.bu alana bu yapım için bir getter ve setter eklemem gerekiyor.userlist adına 
//bu getter setter ekelem sebebim register ekrandan bu bilgileri çekebilmek

    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        NewJFrame.user_list = user_list;
    }

    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regısterlogınpanel = new javax.swing.JPanel();
        regıster = new javax.swing.JButton();
        logın = new javax.swing.JButton();
        logınpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcıgirdi = new javax.swing.JTextField();
        parolagirdi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regısterlogınpanel.setBackground(new java.awt.Color(255, 0, 0));

        regıster.setText("Register");
        regıster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regısterActionPerformed(evt);
            }
        });

        logın.setText("Logın");
        logın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logınActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regısterlogınpanelLayout = new javax.swing.GroupLayout(regısterlogınpanel);
        regısterlogınpanel.setLayout(regısterlogınpanelLayout);
        regısterlogınpanelLayout.setHorizontalGroup(
            regısterlogınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regısterlogınpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regıster, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(logın, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        regısterlogınpanelLayout.setVerticalGroup(
            regısterlogınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regısterlogınpanelLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(regısterlogınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logın)
                    .addComponent(regıster))
                .addGap(31, 31, 31))
        );

        logınpanel.setBackground(new java.awt.Color(0, 0, 102));
        logınpanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Parola");

        javax.swing.GroupLayout logınpanelLayout = new javax.swing.GroupLayout(logınpanel);
        logınpanel.setLayout(logınpanelLayout);
        logınpanelLayout.setHorizontalGroup(
            logınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logınpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(logınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parolagirdi)
                    .addComponent(kullanıcıgirdi))
                .addContainerGap())
        );
        logınpanelLayout.setVerticalGroup(
            logınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logınpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullanıcıgirdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(logınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(parolagirdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regısterlogınpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logınpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logınpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regısterlogınpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regısterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regısterActionPerformed
       //Regıster buton basıldığında gerçekleşecek işlemler
       //regıstera basıldığında diğer JFRAME GEÇMEK İSTİYORUM
       RegısterEkranı re = new RegısterEkranı();
       re.setVisible(true);
       
    }//GEN-LAST:event_regısterActionPerformed

    private void logınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logınActionPerformed
        //Login buton basıldığı zaman gerçekleştirilecek activiteler : 
        String kullanıcı_kontrol = kullanıcıgirdi.getText();
        String parola_kontrol = new String(parolagirdi.getPassword());
        if(user_list.size() == 0){
            //eğer userlist boş ise olacaklar 
            JOptionPane.showMessageDialog(this, "Hiçbir Kullanıcı Bulunmamaktadır.");
        }else{
            //eğer bir user varsa burada iki işlem gerekiyor bu userı aramak ve eşleştirmek
            for(User user : user_list){
                //döngü içerisinde geziniyorum ve kontrol yapıyorum
                if(user.getKullanıcı_adı().equals(kullanıcı_kontrol) && user.getParola().equals(parola_kontrol)){
                    JOptionPane.showMessageDialog(this, "HOŞGELDİNİZ GİRİŞ İŞLEMİ BAŞARILI "+kullanıcı_kontrol.toUpperCase());
                    return;
                }
                    
                
            }
            JOptionPane.showMessageDialog(this, "Böyle bir Kullanıcı bulunmamaktadır.Lütfen register olun");
            //bu yapıyı for dışında tanımladım çünkü bir kez kullanıcıya gösterilsin istiyorum.
        }
    }//GEN-LAST:event_logınActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanıcıgirdi;
    private javax.swing.JButton logın;
    private javax.swing.JPanel logınpanel;
    private javax.swing.JPasswordField parolagirdi;
    private javax.swing.JButton regıster;
    private javax.swing.JPanel regısterlogınpanel;
    // End of variables declaration//GEN-END:variables
}
