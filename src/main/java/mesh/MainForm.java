package mesh;

import static java.lang.Short.MAX_VALUE;
import static java.lang.System.out;
import static javax.swing.GroupLayout.DEFAULT_SIZE;
import static javax.swing.SwingConstants.BOTTOM;
//import static javax.swing.BorderFactory.createLineBorder;
//import static javax.swing.UIManager.setLookAndFeel;
import static javax.swing.SwingConstants.RIGHT;

//import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

public class MainForm extends JFrame {
    public static final String LAST = "Last: ";
    private static final long serialVersionUID = 1L;
    public static String BUG = "0:0:.:0:1:.:0:2:.:0:3:.:0:4:1:0:5:Flag:0:6:Flag:1:0:.:1:1:.:1:2:.:1:3:.:1:4:1:1:5:3:1:6:Flag:2:0:1:2:1:2:2:2:2:2:3:1:2:4:1:2:5:2:2:6:2:3:0:2:3:1:Flag:3:2:Flag:3:3:2:3:4:2:3:5:Flag:3:6:1:4:0:Flag:4:1:0%:4:2:3:4:3:Flag:4:4:0%:4:5:3:4:6::5:0:1:5:1:1:5:2:1:5:3:1:5:4:3:5:5:Flag:5:6:Flag:6:0:.:6:1:.:6:2:.:6:3:.:6:4:2:6:5:Flag:6:6:0%";

    JTable mGrid;
    PlayGroundModel mDataModel;

    private JScrollPane mGridView;
    private JButton mRandom;
    private JButton mClear;
    // private JButton mRestore;
    private JLabel mLastStateLabel;
    private JButton mProbCalc;
    public List<Cell> mLessLikelyCells = new ArrayList<Cell>();

    private JButton getClear() {
        if (mClear == null) {
            mClear = new JButton();
            mClear.setText("Clear");
            mClear.addActionListener(new ClearAction(this));
        }
        return mClear;
    }

    public String mLastState = "";

    public JLabel getLastStateLabel() {
        if (mLastStateLabel == null) {
            mLastStateLabel = new JLabel();
            mLastStateLabel.setText(LAST);
            mLastStateLabel.setHorizontalAlignment(RIGHT);
            mLastStateLabel.setVerticalAlignment(BOTTOM);
        }
        return mLastStateLabel;
    }

    private JButton getRandom() {
        if (mRandom == null) {
            mRandom = new JButton();
            mRandom.setText("Random");
            mRandom.addActionListener(new RandomAction(this));

        }
        return mRandom;

    }

    public Component getGridView() {
        if (mGridView == null) {
            mGridView = new JScrollPane(getGrid());
            mGridView.getVerticalScrollBar()
                    .setPreferredSize(new Dimension(0, 0));

        }
        return mGridView;
    }

    public JTable getGrid() {
        if (mGrid == null) {
            mGrid = new JTable();

            setDataModel(new PlayGroundModel(this));
            mGrid.setModel(getDataModel());
            mGrid.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            mGrid.addKeyListener(new CellKeyListener(this));
            mGrid.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            mGrid.setColumnSelectionAllowed(true);
            mGrid.setRowSelectionAllowed(true);
            mGrid.setTableHeader(null);
            MouseAction mouseAction = new MouseAction(this);
            mGrid.addMouseWheelListener(mouseAction);
            mGrid.addMouseListener(mouseAction);

            final TableCellRenderer rndr = mGrid
                    .getDefaultRenderer(Object.class);
            mGrid.setDefaultRenderer(Object.class,
                    new OurCellRenderer(this, rndr));

        }
        return mGrid;

    }

    public MainForm() {
        try {
            UIManager.LookAndFeelInfo[] looks = UIManager
                    .getInstalledLookAndFeels();
            for (UIManager.LookAndFeelInfo look : looks) {
                System.out.println(look.getClassName());
            }

            // setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // Thread db = new Thread(new Runnable() {
        // @Override
        // public void run() {
        // }
        // });
        // db.start();

        setSize(470, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setTitle("Mines: " + Accomodations.MAX_NUM);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(getGridView(), DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup() //
                        .addComponent(getRandom()) //
                        .addComponent(getClear()) //
                        .addComponent(getProbCalc())//
                        .addComponent(getLastStateLabel())//
                )//
        );

        layout.setHorizontalGroup( //
                layout.createParallelGroup() //
                        .addComponent(//
                                getGridView(), 100, DEFAULT_SIZE,
                                Integer.MAX_VALUE//
                        ).addGroup(layout.createSequentialGroup() //
                                .addComponent(getProbCalc())//
                                .addComponent(getRandom()) //
                                .addComponent(getClear()) //
                                .addComponent(getLastStateLabel(), DEFAULT_SIZE,
                                        115, MAX_VALUE) //
                        )//
        );

    }

    public static void main(String[] argv) {
        MainForm form = new MainForm();
        form.setVisible(true);

    }

    public void setDataModel(PlayGroundModel dataModel) {
        mDataModel = dataModel;
    }

    public PlayGroundModel getDataModel() {
        return mDataModel;
    }

    public void setGridView(JScrollPane gridView) {
        mGridView = gridView;
    }

    private JButton getProbCalc() {
        if (mProbCalc == null) {
            mProbCalc = new JButton("Calc");
            mProbCalc.addActionListener(new ProbabilityAction(this));
        }
        return mProbCalc;
    }

    private boolean clear = true;
    private String[][] mBackup;

    void clear(int mod) {
        int size = getDataModel().getSize();
        if (mBackup == null) {
            mBackup = new String[size][size];
        }

        if (clear) {
            clearAndSave(mod, size);
            getClear().setText("Restore");
        } else {
            restore(mod, size);
            getClear().setText("Clear");
        }
        clear = !clear;
        getDataModel().fireTableDataChanged();
    }

    private void clearAndSave(int mod, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                out.println(i + ":" + j + ":" + getDataModel().matrix[i][j]);
                mBackup[i][j] = getDataModel().matrix[i][j];
                if (mod > 0) {
                    String str = getDataModel().matrix[i][j];
                    if ((str.indexOf("%") >= 0) || ("Flag".equals(str))) {
                        getDataModel().matrix[i][j] = "";
                    }

                } else {
                    getDataModel().matrix[i][j] = "";
                }
            }
        }
    }

    private void restore(int mod, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                getDataModel().matrix[i][j] = mBackup[i][j];
            }
        }
    }

}
