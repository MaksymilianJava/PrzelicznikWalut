/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przelicznikWalut;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
class ArrowPanel extends JPanel
{
    public ArrowPanel()
    {
        super();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Image icon = new ImageIcon("arrow.png").getImage();
        g.drawImage(icon, (this.getWidth()-icon.getWidth(this))/2, 1, null);
    }
}
