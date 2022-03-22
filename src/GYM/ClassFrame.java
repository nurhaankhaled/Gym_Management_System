package GYM;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nurhan
 */
public class ClassFrame extends javax.swing.JFrame {
    String Classselectedvalue="Choose Class";
    String IDSearch;
    String Allmembers = "";
    Member removedMember;
    String[] data = new String[GymMangement.size];
    /**
     * Creates new form ClassFrame
     */
    public ClassFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateDeletePanel = new javax.swing.JPanel();
        ClassesHeader = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        Viewbutton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ClassesBox = new javax.swing.JComboBox<>();
        Close_Button = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RemovingMembers = new javax.swing.JTextField();
        AddingMembers = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MembersList = new javax.swing.JTextArea();
        lbl_ClassDescribe = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClassDescription = new javax.swing.JTextArea();
        RemoveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 250));
        setUndecorated(true);

        UpdateDeletePanel.setBackground(new java.awt.Color(204, 204, 204));
        UpdateDeletePanel.setToolTipText("");

        ClassesHeader.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        ClassesHeader.setForeground(new java.awt.Color(51, 51, 51));
        ClassesHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list of members.png"))); // NOI18N
        ClassesHeader.setText("Classes");

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(51, 51, 51));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        Viewbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Viewbutton.setForeground(new java.awt.Color(51, 51, 51));
        Viewbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png"))); // NOI18N
        Viewbutton.setText("View Class Members");
        Viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbuttonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Classes");

        ClassesBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClassesBox.setForeground(new java.awt.Color(51, 51, 51));
        GymMangement.classnames.clear();
        for (Class cl : GymMangement.classes)
        {
            GymMangement.classnames.add(cl.Classname);
        }
        for(int i = 0; i < GymMangement.classnames.size(); i++)
        {
            data[i] = GymMangement.classnames.get(i);
        }
        ClassesBox.setModel(new javax.swing.DefaultComboBoxModel<>(data));
        ClassesBox.setToolTipText("");
        ClassesBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClassesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassesBoxActionPerformed(evt);
            }
        });

        Close_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Enter ID to remove a member:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Enter ID to add a member:");

        RemovingMembers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemovingMembers.setForeground(new java.awt.Color(255, 0, 0));

        AddingMembers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddingMembers.setForeground(new java.awt.Color(255, 0, 0));

        MembersList.setEditable(false);
        MembersList.setLineWrap(true);
        MembersList.setColumns(20);
        MembersList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MembersList.setForeground(new java.awt.Color(51, 51, 51));
        MembersList.setRows(5);
        MembersList.setText(" ");
        MembersList.setSelectionColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(MembersList);

        lbl_ClassDescribe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_ClassDescribe.setForeground(new java.awt.Color(51, 51, 51));
        lbl_ClassDescribe.setText("Class description");

        ClassDescription.setEditable(false);
        ClassDescription.setColumns(20);
        ClassDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClassDescription.setForeground(new java.awt.Color(51, 51, 51));
        ClassDescription.setRows(5);
        ClassDescription.setText(" ");
        ClassDescription.setSelectionColor(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(ClassDescription);

        RemoveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemoveButton.setForeground(new java.awt.Color(51, 51, 51));
        RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateDeletePanelLayout = new javax.swing.GroupLayout(UpdateDeletePanel);
        UpdateDeletePanel.setLayout(UpdateDeletePanelLayout);
        UpdateDeletePanelLayout.setHorizontalGroup(
            UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(ClassesHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Close_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(AddingMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddButton))
                            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(Viewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateDeletePanelLayout.createSequentialGroup()
                        .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateDeletePanelLayout.createSequentialGroup()
                                .addComponent(ClassesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(lbl_ClassDescribe))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateDeletePanelLayout.createSequentialGroup()
                                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(RemovingMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 370, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateDeletePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        UpdateDeletePanelLayout.setVerticalGroup(
            UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close_Button)
                    .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ClassesHeader)
                        .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClassesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UpdateDeletePanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lbl_ClassDescribe)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Viewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddingMembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemovingMembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveButton))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateDeletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateDeletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void ClassesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesBoxActionPerformed

        Classselectedvalue = ClassesBox.getSelectedItem().toString();   
        for (Class cl : GymMangement.classes)
        { 
            if(cl.Classname == Classselectedvalue)
            { 
                String g =cl.description;
                ClassDescription.setText(g);
            }
        }
        MembersList.setText("");
        
    }//GEN-LAST:event_ClassesBoxActionPerformed

    private void ViewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbuttonActionPerformed
        Viewmembers();
    }//GEN-LAST:event_ViewbuttonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
       IDSearch=AddingMembers.getText();
       boolean Exists=false;
       try
       {
         if(Integer.parseInt(IDSearch) > Member.numberofmembers)
         {
            JOptionPane.showMessageDialog(null,"There is no such Member.");
         }
         else
         {
            for (Member mem1 : GymMangement.members)
            {
             String codestring = String.valueOf(mem1.code);
          
               if(codestring.equals (IDSearch))
                {
                    Exists=true;
                    for (Class cl : GymMangement.classes)
                    {
                       if(cl.Classname == Classselectedvalue)
                        {
                          if(Availability(cl, mem1)==true)
                          { 
                            mem1.Memclasses=cl; 
                            cl.Classmembers.add(mem1);
                          }
                    
                        }
                    
                    }
                    AddingMembers.setText("");
                }
            }
            if(Exists==false)
            {
              JOptionPane.showMessageDialog(null,"There is no such Member.");
            }
                    
             Viewmembers();
        }

        }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,"Please enter a member ID to Add.");
            System.out.println(e.getMessage());
       }
    
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
       IDSearch=RemovingMembers.getText();
       boolean Exists=false;
       try
       {
          if(Integer.parseInt(IDSearch) > Member.numberofmembers)
          { 
            JOptionPane.showMessageDialog(null,"There is no such Member.");

          }
          else
          {
            for (Member mem1 : GymMangement.members)
            {
                String codestring = String.valueOf(mem1.code);
          
                if(codestring.equals (IDSearch))
                {
                    Exists=true;
                    removedMember = mem1 ;
                    mem1.Memclasses=GymMangement.Defaultclass; 
                }
               
            } 
                    for (Class cl : GymMangement.classes)
                    {
                       if(cl.Classname == Classselectedvalue)
                       {
                           cl.Classmembers.remove(removedMember);  
                       }
                    }
            RemovingMembers.setText("");
            if(Exists==false)
            {
                JOptionPane.showMessageDialog(null,"There is no such Member.");
            }
            Viewmembers();
          }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Please enter a member ID to remove.");
           System.out.println(e.getMessage());
        }
       

    }//GEN-LAST:event_RemoveButtonActionPerformed
    private void Viewmembers()
    {
       for (Member mem1 : GymMangement.members)
       {
            if(mem1.Memclasses.Classname.equals(Classselectedvalue))
            {
                   
                Allmembers=Allmembers.concat("Name: "+mem1.Name +"   ID:"+ String.valueOf(mem1.code)+'\n');
                
            }           
       }      
       MembersList.setText(Allmembers);
       Allmembers="";
    }
    
    private boolean Availability(Class cl,Member mem1)
    {
        if(cl.avaiability=="Unavailable")
        {
          JOptionPane.showMessageDialog(null,"This Class is currently unavailable.");
            return false;
        }
        if(cl.Classmembers.size()==cl.limitedNumber)
        {
            JOptionPane.showMessageDialog(null,"This Class is full.");
            return false;
        }
        else if(mem1.Memclasses != GymMangement.Defaultclass)
        {
             JOptionPane.showMessageDialog(null,"This member is already in a Class.");
            return false;
        }
        else
        {
            return true;
        }
    }
    
  
    
  
    public static void main(String args[]) {

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AddingMembers;
    private javax.swing.JTextArea ClassDescription;
    private javax.swing.JComboBox<String> ClassesBox;
    private javax.swing.JLabel ClassesHeader;
    private javax.swing.JButton Close_Button;
    private javax.swing.JTextArea MembersList;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTextField RemovingMembers;
    private javax.swing.JPanel UpdateDeletePanel;
    private javax.swing.JButton Viewbutton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_ClassDescribe;
    // End of variables declaration//GEN-END:variables
}