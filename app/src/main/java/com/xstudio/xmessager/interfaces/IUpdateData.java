package com.xstudio.xmessager.interfaces;
import com.xstudio.xmessager.types.FriendInfo;

public interface IUpdateData {
	public void updateData(FriendInfo[] friends, FriendInfo[] unApprovedFriends, String userKey);

}
