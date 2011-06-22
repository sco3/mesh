package mesh;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;

public class MainForm extends JFrame {
	private static final long serialVersionUID = 1L;

	JTable mGrid;
	PlayGroundModel mDataModel;

	private JButton mImport;
	JTextField mImportText;
	private Component mGridView;
	private JButton mRandom;
	private JButton mClear;
	private JButton mSave;
	private JButton mStat;
	private JButton mImportCsv;
	private JCheckBox mWon;
	private JButton mProbCalc;

	public JCheckBox getWon() {
		if (mWon == null) {
			mWon = new JCheckBox();
			mWon.setText("won");
		}
		return mWon;
	}

	private JButton getImportCsv() {
		if (mImportCsv == null) {
			mImportCsv = new JButton("Import csv");
			mImportCsv.addActionListener(new ImportCsvAction(this));
		}
		return mImportCsv;
	}

	private JButton getStat() {
		if (mStat == null) {
			mStat = new JButton("Stat");
			mStat.addActionListener(new StatAction(this));
		}
		return mStat;
	}

	private JButton getSave() {
		if (mSave == null) {
			mSave = new JButton("Save");
			mSave.addActionListener(new SaveAction(this));
		}
		return mSave;
	}

	private JButton getClear() {
		if (mClear == null) {
			mClear = new JButton();
			mClear.setText("Clear");
			mClear.addActionListener(new ClearAction(this));
		}
		return mClear;
	}

	private JButton getRandom() {
		if (mRandom == null) {
			mRandom = new JButton();
			mRandom.setText("Random");
			mRandom.addActionListener(new RandomAction(this));

		}
		return mRandom;

	}

	private Component getImportText() {
		if (mImportText == null) {
			mImportText = new JTextField();
			// mImportText.setText(""//
			// + "0_0_0_0_0_0_0_"//
			// + "0_0_0_0_0_0_0_"//
			// + "0_0_0_0_0_0_0_"//
			// + "1_0_0_1_0_0_1_"//
			// + "0_0_0_0_0_0_0_"//
			// + "0_0_0_0_0_0_0_"//
			// + "1_0_0_1_0_0_1_"//
			//
			// );
		}
		return mImportText;
	}

	private JButton getImportButton() {
		if (mImport == null) {
			mImport = new JButton();
			mImport.setText("Import");
			mImport.addActionListener(new ImportAction(this));

		}
		return mImport;
	}

	public Component getGridView() {
		if (mGridView == null) {
			mGridView = new JScrollPane(getGrid());

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

			final TableCellRenderer rndr = mGrid
					.getDefaultRenderer(Object.class);
			mGrid.setDefaultRenderer(Object.class, new OurCellRenderer(this,
					rndr));

		}
		return mGrid;

	}

	public MainForm() {
		Thread db = new Thread(new Runnable() {

			@Override
			public void run() {
				Db.getEm();
			}
		});
		db.start();

		setSize(470, 520);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(
				getGridView(), GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(
						layout.createParallelGroup(
								GroupLayout.Alignment.BASELINE) //
								.addComponent(getImportText()) //
								.addComponent(getImportButton(),
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)) //
				.addGroup(

				layout.createParallelGroup() //
						.addComponent(getRandom()) //
						.addComponent(getClear()) //
						.addComponent(getSave()) //
						.addComponent(getWon()) //
						.addComponent(getStat()) //
						.addComponent(getImportCsv())) //
				.addGroup(

				layout.createParallelGroup() //
						.addComponent(getProbCalc())//
				)

		);

		layout.setHorizontalGroup( //
				layout.createParallelGroup() //
						.addComponent(getGridView(), 100,
								GroupLayout.DEFAULT_SIZE, Integer.MAX_VALUE) //
						.addGroup(GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup() //
										.addComponent(getImportText()) //
										.addComponent(getImportButton())) //

						.addGroup(

						layout.createSequentialGroup() //
								.addComponent(getRandom()) //
								.addComponent(getClear()) //
								.addComponent(getSave()) //
								.addComponent(getWon()) //
								.addComponent(getStat()) //
								.addComponent(getImportCsv())) //
						.addGroup( //

								layout.createSequentialGroup() //
										.addComponent(getProbCalc()) //		
						)

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

	public void setGridView(Component gridView) {
		mGridView = gridView;
	}

	private JButton getProbCalc() {
		if (mProbCalc == null) {
			mProbCalc = new JButton("Calc");
			mProbCalc.addActionListener(new ProbabilityAction(this));
		}
		return mProbCalc;
	}

}
