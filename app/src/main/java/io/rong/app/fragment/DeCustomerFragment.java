package io.rong.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.rong.app.R;
import io.rong.imkit.RongIM;

/**
 * Created by Administrator on 2015/3/6.
 */
public class DeCustomerFragment extends Fragment implements View.OnClickListener {

    /**
     * 客服聊天的按钮
     */
    private TextView mCustomerChat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.de_fr_customer, container, false);
        mCustomerChat = (TextView) view.findViewById(R.id.customer_chat);
        mCustomerChat.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.customer_chat:
                if (RongIM.getInstance() != null) {
                    RongIM.getInstance().startCustomerServiceChat(getActivity(), "kefu114", "在线客服");
                }
                break;
        }
    }
}
