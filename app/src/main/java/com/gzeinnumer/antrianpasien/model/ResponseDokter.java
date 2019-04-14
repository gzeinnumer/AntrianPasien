package com.gzeinnumer.antrianpasien.model;

import com.google.gson.annotations.SerializedName;

//todo 2
public class ResponseDokter{

	@SerializedName("DokterID")
	private String dokterID;

	@SerializedName("FBAccount")
	private String fBAccount;

	@SerializedName("KotaID")
	private String kotaID;

	@SerializedName("PhotoFileName")
	private String photoFileName;

	@SerializedName("KotaName")
	private String kotaName;

	@SerializedName("PinBbm")
	private String pinBbm;

	@SerializedName("WANumber")
	private String wANumber;

	@SerializedName("SpesialisasiName")
	private String spesialisasiName;

	@SerializedName("IGAccount")
	private String iGAccount;

	@SerializedName("SpesialisasiID")
	private String spesialisasiID;

	@SerializedName("Profile")
	private String profile;

	@SerializedName("DokterName")
	private String dokterName;

	public ResponseDokter(String dokterID, String fBAccount, String kotaID, String photoFileName, String kotaName, String pinBbm, String wANumber, String spesialisasiName, String iGAccount, String spesialisasiID, String profile, String dokterName) {
		this.dokterID = dokterID;
		this.fBAccount = fBAccount;
		this.kotaID = kotaID;
		this.photoFileName = photoFileName;
		this.kotaName = kotaName;
		this.pinBbm = pinBbm;
		this.wANumber = wANumber;
		this.spesialisasiName = spesialisasiName;
		this.iGAccount = iGAccount;
		this.spesialisasiID = spesialisasiID;
		this.profile = profile;
		this.dokterName = dokterName;
	}

	public void setDokterID(String dokterID){
		this.dokterID = dokterID;
	}

	public String getDokterID(){
		return dokterID;
	}

	public void setFBAccount(String fBAccount){
		this.fBAccount = fBAccount;
	}

	public String getFBAccount(){
		return fBAccount;
	}

	public void setKotaID(String kotaID){
		this.kotaID = kotaID;
	}

	public String getKotaID(){
		return kotaID;
	}

	public void setPhotoFileName(String photoFileName){
		this.photoFileName = photoFileName;
	}

	public String getPhotoFileName(){
		return photoFileName;
	}

	public void setKotaName(String kotaName){
		this.kotaName = kotaName;
	}

	public String getKotaName(){
		return kotaName;
	}

	public void setPinBbm(String pinBbm){
		this.pinBbm = pinBbm;
	}

	public String getPinBbm(){
		return pinBbm;
	}

	public void setWANumber(String wANumber){
		this.wANumber = wANumber;
	}

	public String getWANumber(){
		return wANumber;
	}

	public void setSpesialisasiName(String spesialisasiName){
		this.spesialisasiName = spesialisasiName;
	}

	public String getSpesialisasiName(){
		return spesialisasiName;
	}

	public void setIGAccount(String iGAccount){
		this.iGAccount = iGAccount;
	}

	public String getIGAccount(){
		return iGAccount;
	}

	public void setSpesialisasiID(String spesialisasiID){
		this.spesialisasiID = spesialisasiID;
	}

	public String getSpesialisasiID(){
		return spesialisasiID;
	}

	public void setProfile(String profile){
		this.profile = profile;
	}

	public String getProfile(){
		return profile;
	}

	public void setDokterName(String dokterName){
		this.dokterName = dokterName;
	}

	public String getDokterName(){
		return dokterName;
	}
}