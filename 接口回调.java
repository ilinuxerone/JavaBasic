    /**�ӿڻص��Ĵ���*/

//*************************************ToolBarUtil��**********************************************
    //1.�����ӿںͽӿڷ���
    public interface OnToolBarClickListener{
        void OnToolBarClick(int position);
    }
    //2.����ӿڱ���
    OnToolBarClickListener mOnToolBarClickListener;

    //4.��¶һ����������setxx
    public void setOnToolBarClickListener(OnToolBarClickListener onToolBarClickListener) {
        mOnToolBarClickListener = onToolBarClickListener;
    }


	//��textview���õ���¼�
	final int finalI = i;
    view.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {
		//�������position���ݵ���һ��ģ��
		//ʹ�ýӿڻص�

		//3.����Ҫ����ֵ�ĵط�ʹ��
			mOnToolBarClickListener.OnToolBarClick(finalI);//position����i
		}
	});

//**************************************MainActivity��************************************************

        mToolBarUtil.setOnToolBarClickListener(new ToolBarUtil.OnToolBarClickListener() {
            @Override
            public void OnToolBarClick(int position) {//��Toobarutil���ݹ���position
                mViewpager.setCurrentItem(position);
            }
        });