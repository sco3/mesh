package mesh;

import static mesh.MainForm.LAST;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

final class MouseAction implements MouseWheelListener, MouseListener {
    /**
     * 
     */
    private final MainForm mMainForm;
    private JPopupMenu menu;

    /**
     * @param mainForm
     */
    MouseAction(MainForm mainForm) {
        mMainForm = mainForm;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int row = mMainForm.mGrid.rowAtPoint(e.getPoint());
        int col = mMainForm.mGrid.columnAtPoint(e.getPoint());

        if (col < 0 || row < 0) {
            return;
        }
        String cur = mMainForm.getDataModel().matrix[row][col];
        boolean found = false;
        int iVar = 0;
        for (; iVar < mVariants.length; iVar++) {
            if (mVariants[iVar].equals(cur)) {
                found = true;
                break;
            }
        }
        if (!found) {
            iVar = 1;
        }
        int rotation = e.getWheelRotation();
        boolean inc = false;

        if (rotation < 0) {
            iVar++;
            inc = true;
        } else {
            iVar--;

        }
        if (iVar < 1) {
            iVar = 1;
        } else if (iVar > mVariants.length - 1) {
            iVar = mVariants.length - 1;
        }
        if (inc && ".".equals(mVariants[iVar])) {
            iVar++;
        }

        mMainForm.getDataModel().matrix[row][col] = mVariants[iVar];
        mMainForm.getDataModel().fireTableCellUpdated(row, col);
        mMainForm.getLastStateLabel().setText(LAST + " " + mVariants[iVar]);
        mMainForm.mLastState = mVariants[iVar];
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.isControlDown()) {
            int row = mMainForm.mGrid.rowAtPoint(e.getPoint());
            int col = mMainForm.mGrid.columnAtPoint(e.getPoint());
            mMainForm.getDataModel().matrix[row][col] = mMainForm.mLastState;
            mMainForm.getDataModel().fireTableCellUpdated(row, col);
        }
    }

    private void showPopup(MouseEvent e) {
        menu = new JPopupMenu("A Menu");
        for (String variant : mVariants) {
            JMenuItem item = new JMenuItem(variant);
            menu.add(item);
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent menuItemEvent) {
                    String command = menuItemEvent.getActionCommand();
                    int row = mMainForm.mGrid.rowAtPoint(e.getPoint());
                    int col = mMainForm.mGrid.columnAtPoint(e.getPoint());
                    mMainForm.getDataModel().matrix[row][col] = command;
                    mMainForm.getDataModel().fireTableCellUpdated(row, col);
                    mMainForm.mLastState = command;
                    mMainForm.getLastStateLabel().setText(command);
                }
            });
        }
        menu.show(e.getComponent(), e.getX(), e.getY());
    }

    private String[] mVariants = new String[] { //
            "", ".", "1", "2", "3", "4", //
            "5", "6", "7", "8", "Flag" //
    };

    private Timer t;

    @Override
    public void mousePressed(MouseEvent e) {
        if (t == null) {
            t = new Timer();

        }
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                showPopup(e);
            }
        }, 300); // 300 millisecond delay - long menu press
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (t != null) {
            t.cancel();
            t = null;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}