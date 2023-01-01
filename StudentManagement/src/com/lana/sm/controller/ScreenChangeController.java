package com.lana.sm.controller;

import com.lana.sm.bean.BeanList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.lana.sm.view.MainFeedJPanel;
import com.lana.sm.view.StudentJPanel;
import com.lana.sm.view.CourseJPanel;
import com.lana.sm.view.ClassJPanel;
import com.lana.sm.view.StaticJPanel;

/**
 *
 * @author lana
 */
public class ScreenChangeController {

    private JPanel root;
    private String kindSelected;

    private List<BeanList> listItem = null;

    public ScreenChangeController(JPanel root) {
        this.root = root;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new MainFeedJPanel());
        root.invalidate();
        root.repaint();
    }

    public void setEvent(List<BeanList> listItem) {
        this.listItem = listItem;
        for (BeanList item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new MainFeedJPanel();
                    break;
                case "HocVien":
                    node = new StudentJPanel();
                    break;
                case "KhoaHoc":
                    node = new CourseJPanel();
                    break;
                case "LopHoc":
                    node = new ClassJPanel();
                    break;
                case "ThongKe":
                    node = new StaticJPanel();
                    break;
                default:
                    node = new MainFeedJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
            }
        }

    }

    private void setChangeBackground(String kind) {
        for (BeanList item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJlb().setBackground(new Color(96, 100, 191));
            } else {
                item.getJpn().setBackground(new Color(76, 178, 80));
                item.getJlb().setBackground(new Color(76, 178, 80));
            }
        }
    }
}
