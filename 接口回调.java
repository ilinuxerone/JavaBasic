    /**接口回调的创建*/

//*************************************ToolBarUtil类**********************************************
    //1.创建接口和接口方法
    public interface OnToolBarClickListener{
        void OnToolBarClick(int position);
    }
    //2.定义接口变量
    OnToolBarClickListener mOnToolBarClickListener;

    //4.暴露一个公共方法setxx
    public void setOnToolBarClickListener(OnToolBarClickListener onToolBarClickListener) {
        mOnToolBarClickListener = onToolBarClickListener;
    }


	//给textview设置点击事件
	final int finalI = i;
    view.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {
		//将点击的position传递到拎一个模块
		//使用接口回调

		//3.在需要传递值的地方使用
			mOnToolBarClickListener.OnToolBarClick(finalI);//position就是i
		}
	});

//**************************************MainActivity类************************************************

        mToolBarUtil.setOnToolBarClickListener(new ToolBarUtil.OnToolBarClickListener() {
            @Override
            public void OnToolBarClick(int position) {//由Toobarutil传递过来position
                mViewpager.setCurrentItem(position);
            }
        });