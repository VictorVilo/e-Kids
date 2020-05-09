package com.project.final_project;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Random;

public class AlphabetImages extends AppCompatActivity {
    public FirebaseStorage storage;
    public StorageReference storageReference;
    public FirebaseAuth firebaseAuth;
    private TextView tvAlphabet, tvSubmit;
    private ImageView alphaImage;
    private EditText et_word;
    private char c;
    private String[] word = {"apple", "ball", "cat", "dog", "elephant", "fish", "goat", "hat", "ink", "jackal", "kite", "lion", "monkey", "nose", "owl", "parrot", "queen", "rat", "sheep", "teeth", "umbrella", "violin", "water", "xmas", "yalk", "zebra", "ant", "bag", "bat", "bee", "bird", "book", "box", "brush", "bus", "cake", "car", "carrot", "chicken", "chocolate", "church", "clock", "clown", "coconut", "cow", "crab", "crocodile", "doll", "door", "egg", "eye", "fan", "finger", "flag", "flower", "fox", "frog", "fruit", "hand", "hen", "horse", "key", "king", "leap", "leg", "lizard", "man", "milk", "moon", "net", "pen", "penguin", "pig", "rabbit", "rainbow", "ship", "snake", "snow", "spoon", "star", "sun", "train", "tree", "turtle", "van", "whale", "wood", "xray", "zip", "zoo", "bear", "black", "deer", "foot", "green", "guava", "guitar", "hippopotamus", "log", "mango", "orange", "pink", "tall", "teddy", "tiger", "toy", "white", "yellow"};


    private String apple = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fapple.png?alt=media&token=b9a3b528-6cd5-4dcb-85f9-d66bf03ad6e7";
    private String ball = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fball.png?alt=media&token=5207e6b9-94f0-4c8b-8ebe-bc229281f6a5";
    private String cat = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcat.png?alt=media&token=27c00191-fb30-4c32-b877-0aaddb4400c1";
    private String dog = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fdog.png?alt=media&token=929373f0-b75c-4f6f-aca8-a6de143e1dc8";
    private String elephant = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Felephant.png?alt=media&token=09f7b048-f8b1-444f-a0eb-5d3defc87892";
    private String fish = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffish.png?alt=media&token=46ea5cfa-a3e8-413d-b8d6-8b5d5e4175fd";
    private String goat = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fgoat.png?alt=media&token=c53d4537-6274-465a-8abc-0baf87229fec";
    private String hat = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fhat.png?alt=media&token=cb93adc5-88bb-4068-bdb5-6dafc165c84d";
    private String ink = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fink.png?alt=media&token=fd42661f-5eda-42ce-9e06-1c944c825f35";
    private String jackal = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fjackal.png?alt=media&token=2cc0b2f9-8c39-488d-9004-bc5fb9ea1d51";
    private String kite = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fkite.png?alt=media&token=97e5711d-f15b-4ee7-a566-993c918d1aee";
    private String lion = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Flion.png?alt=media&token=0f13f624-13e5-41ca-96ea-4dc346e39537";
    private String monkey = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fmonkey.png?alt=media&token=10a4aa2f-9bcc-420c-96ed-4a7f8adfee8d";
    private String nose = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fnose.png?alt=media&token=2543b82b-860f-4d99-8dc1-9f7af4141019";
    private String owl = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fowl.png?alt=media&token=aff198bb-b4d8-4918-9ff8-1b42f7692992";
    private String parrot = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fparrot.png?alt=media&token=8c485efc-e766-4ecb-8521-3fab37364d70";
    private String queen = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fqueen.png?alt=media&token=b3e166f3-bc20-4412-abc3-f28e9097db1e";
    private String rat = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Frat.png?alt=media&token=59b2d00d-8509-4a33-989e-45f6dc17f9b8";
    private String sheep = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fsheep.png?alt=media&token=e76a6c78-683b-4765-bcc6-555b6f2ffa14";
    private String teeth = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fteeth.png?alt=media&token=60a2003e-2c76-467f-9296-d6caf1f86f47";
    private String umbrella = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fumbrella.png?alt=media&token=c714ed48-dd1a-4f28-9c4a-774a3d2e3412";
    private String violin = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fviolin.png?alt=media&token=c2e24d63-2afd-4171-b197-1a8d93e15fac";
    private String water = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fwater.png?alt=media&token=f4aee47c-ce8f-4efb-8abc-218a4ef869c1";
    private String xmas = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fxmas.png?alt=media&token=aec4736c-f74d-4cc1-b09c-54ee27b86d89";
    private String yalk = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fyalk.png?alt=media&token=d382eba6-81dc-485c-98d9-358252944b1d";
    private String zebra = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fzebra.png?alt=media&token=70ab950d-24b2-4447-821c-f40dd2619c9e";
    private String ant = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fant.png?alt=media&token=43bc2367-34ec-48e2-836d-3da178858067";
    private String bag = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbag.png?alt=media&token=da8cd6a8-803c-4b55-b33f-87b0b04cc193";
    private String bat = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbat.png?alt=media&token=6068cf33-7156-49b8-9297-f187aff04cbe";
    private String bee = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbee.png?alt=media&token=7b93c038-6837-4adb-876b-51213aa59303";
    private String bird = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbird.png?alt=media&token=4923a5ce-22a5-4475-ae65-d733c9f48346";
    private String book = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbook.png?alt=media&token=f6d672f3-63fd-4b6b-be8a-333340b38d53";
    private String box = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbox.png?alt=media&token=9f3f6429-3b8f-4a11-9b67-1ee0431b0206";
    private String brush = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbrush.png?alt=media&token=7f622150-1683-4c33-ac85-4bea9632f572";
    private String bus = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbus.png?alt=media&token=44024883-2671-42d3-9b7a-baff093d582a";
    private String cake = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcake.png?alt=media&token=8f66c4ef-c5d7-4402-a43c-ba1982b68709";
    private String car = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcar.png?alt=media&token=53c05394-c472-4285-ad2d-cc93a00f97a5";
    private String carrot = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcarrot.png?alt=media&token=c02b42b0-b473-4726-8bc0-6cf51248c394";
    private String chicken = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fchicken.png?alt=media&token=517cd632-6e5a-47f6-a19a-8b6765f98e93";
    private String chocolate = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fchocolate.png?alt=media&token=c2eea01b-7a4a-4ec3-bd09-16b3b19c6892";
    private String church = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fchurch.png?alt=media&token=bade26d7-8d50-4e01-9efc-913a40335267";
    private String clock = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fclock.png?alt=media&token=6aeac67e-9bb7-443c-af3d-d281ed0df250";
    private String clown = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fclown.png?alt=media&token=6709118d-59b6-4a59-88b7-9d3b35d3f8cb";
    private String coconut = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcoconut.png?alt=media&token=36f52dd7-8a8d-425c-ac15-81d9911811c7";
    private String cow = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcow.png?alt=media&token=fa90b898-a3da-4206-b4d3-e0ddfae602c8";
    private String crab = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcrab.png?alt=media&token=cf0ccfcc-ca00-4569-913f-ddd96116e879";
    private String crocodile = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fcrocodile.png?alt=media&token=e93c2b8b-43c3-4ff5-9f9f-c96809606d2f";
    private String doll = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fdoll.png?alt=media&token=15b7224f-36cd-4e28-96d8-e2adb2801938";
    private String door = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fdoor.png?alt=media&token=24031515-d5a5-4b21-b34f-3553d9696872";
    private String egg = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fegg.png?alt=media&token=a495683d-5ed8-4ca2-b3ec-e99331e413b8";
    private String eye = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Feye.png?alt=media&token=a791e85b-d2d8-4d8e-94bc-e63ee0ecd350";
    private String fan = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffan.png?alt=media&token=ade53bb9-4f61-4e40-b2cb-6a9169673eaf";
    private String finger = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffinger.png?alt=media&token=5735e809-68c5-4f2a-8df4-402077185bf6";
    private String flag = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fflag.png?alt=media&token=cc020ba2-173e-477d-83d1-cdca470a08d1";
    private String flower = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fflower.png?alt=media&token=a1178b1f-a665-4248-80e2-ec5fb0c8abb1";
    private String fox = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffox.png?alt=media&token=b06a33e7-5e0f-4495-81fa-1b4e63939a78";
    private String frog = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffrog.png?alt=media&token=2f86e0a0-6ae2-4b3f-b2e9-37e04c23e7c3";
    private String fruit = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffruit.png?alt=media&token=1b39c841-b2b9-4224-8cf1-5d9db37627d6";
    private String hand = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fhand.png?alt=media&token=ab3bc9cf-5e15-47ef-a4b6-f54b5f4d07d6";
    private String hen = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fhen.png?alt=media&token=b6cb2905-6843-447d-84e9-b3e68810c2e7";
    private String horse = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fhorse.png?alt=media&token=dd7306f8-f870-4e10-afcb-4df3c44528a6";
    private String key = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fkey.png?alt=media&token=3c47a6a4-7ddd-4261-be90-eb7e483b3b85";
    private String king = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fking.png?alt=media&token=c5ef6c18-94e0-456a-abd3-21d521a4e665";
    private String leap = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fleap.png?alt=media&token=7516bdfa-c302-4523-b66d-8566e1118c43";
    private String leg = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fleg.png?alt=media&token=b5d123bc-afb7-4b3b-8fa3-059b853c584f";
    private String lizard = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Flizard.png?alt=media&token=b5a2333f-0213-4987-b9a8-3dd531ff8fef";
    private String man = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fman.png?alt=media&token=595d68a5-a399-45a6-8024-ce6518d5218b";
    private String milk = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fmilk.png?alt=media&token=4c9698f9-ccee-4d54-984b-116b88c7a9f9";
    private String moon = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fmoon.png?alt=media&token=dceedf47-77e8-4bd0-90b5-53a7b6faa9d1";
    private String net = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fnet.png?alt=media&token=1e357850-7aa7-4ef7-b9a8-e412c6592149";
    private String pen = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fpen.png?alt=media&token=9cdbb7d5-3e86-4dab-b87d-7e47c64baa0c";
    private String penguin = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fpenguin.png?alt=media&token=63bb746c-f646-476c-a9fa-aafe5dfc4d04";
    private String pig = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fpig.png?alt=media&token=e4472e6c-77e3-4eda-988d-f68858a7120f";
    private String rabbit = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Frabbit.png?alt=media&token=f84ff313-3f5c-437e-b443-202ec05bf9ee";
    private String rainbow = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Frainbow.png?alt=media&token=fc6360bd-c3be-46dc-927b-0d76e4b7ab07";
    private String ship = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fship.png?alt=media&token=25859045-1227-49b2-952e-43a8bdf91dfa";
    private String snake = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fsnake.png?alt=media&token=6c6fffe8-f450-4391-a862-8e22b710e1d9";
    private String snow = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fsnow.png?alt=media&token=61fa81b0-6337-480e-adcd-59a8cfefc49d";
    private String spoon = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fspoon.png?alt=media&token=c5ef6e85-c043-4c30-bf04-0bc2a3448925";
    private String star = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fstar.png?alt=media&token=3e6dc205-6bb4-4ae8-b5bd-13af8484e4d8";
    private String sun = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fsun.png?alt=media&token=e9898c29-bbdc-4833-83ae-a39a5bfcbbd7";
    private String train = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ftrain.png?alt=media&token=24c123aa-9cb1-4b3f-81f0-056a159a7d35";
    private String tree = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ftree.png?alt=media&token=9e388da3-3af3-4218-a4fe-a3574d85cabf";
    private String turtle = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fturtle.png?alt=media&token=43c78f79-41b0-4119-9a17-7039da255cfc";
    private String van = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fvan.png?alt=media&token=9342674b-8936-464d-a20f-460095775349";
    private String whale = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fwhale.png?alt=media&token=412a671a-50ac-4240-ab34-b9408d89a075";
    private String wood = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fwood.png?alt=media&token=d8d9c834-123a-4520-9769-d8ca0de110ae";
    private String xray = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fxray.png?alt=media&token=0b1a2ab7-8366-469a-9248-73d06bed7f44";
    private String zip = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fzip.png?alt=media&token=9c47edfe-997c-429f-bc35-cb97940a4e96";
    private String zoo = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fzoo.png?alt=media&token=e912756f-cd4b-494b-ab2f-42030bce15a8";
    private String bear = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fbear.png?alt=media&token=3ad089c4-72b4-4b19-bbe3-1c003d18165d";
    private String black = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fblack.png?alt=media&token=2a34dc68-3432-4d0a-af1f-a86de3d4a3e6";
    private String deer = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fdeer.png?alt=media&token=fdfe4c1f-c0b0-46d8-92e8-3f7cba742b72";
    private String foot = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ffoot.png?alt=media&token=c3aac476-beb1-48e0-a83e-1cfe1d48fe62";
    private String green = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fgreen.png?alt=media&token=fc9b8b49-4068-453f-8788-b7124abab0d9";
    private String guava = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fguava.png?alt=media&token=a986e4a9-4ddc-4c49-a421-ae5f641762be";
    private String guitar = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fguitar.png?alt=media&token=4822e966-77e3-4bca-b85d-33901026346d";
    private String hippopotamus = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fhippopotamus.png?alt=media&token=e0f8e909-4610-4a85-84e7-07bfa2c80a6e";
    private String log = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Flog.png?alt=media&token=0ff858d2-60d0-4db3-9c38-459af1ab45f5";
    private String mango = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fmango.png?alt=media&token=8f3520b7-fbbc-4943-889e-7c0b71db6810";
    private String orange = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Forange.png?alt=media&token=2f20cfac-ee9f-4399-a569-890a8bb1daba";
    private String pink = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fpink.png?alt=media&token=89cc66b6-2b17-4125-a2e9-a72870771cbc";
    private String tall = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ftall.png?alt=media&token=f8ccbffa-46b2-434e-a3a6-308289daf543";
    private String teddy = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fteddy.png?alt=media&token=e282a421-e9b6-40e9-b137-19fb0e388ad8";
    private String tiger = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ftiger.png?alt=media&token=36572849-e984-46ed-9702-08c1b3881087";
    private String toy = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Ftoy.png?alt=media&token=b1caee48-3a4a-4d19-863d-7bab7d862a96";
    private String white = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fwhite.png?alt=media&token=bd2a800b-cbfb-4471-8fbe-f109358946aa";
    private String yellow = "https://firebasestorage.googleapis.com/v0/b/children-s-learning-app.appspot.com/o/6RXs9un6gdOMJX3VFguPLhNUviz2%2Fyellow.png?alt=media&token=07011429-6488-43a3-9114-2db0f740f8a2";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_images);

        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();
        firebaseAuth = FirebaseAuth.getInstance();
        initLayout();
    }

    private void initLayout() {
        tvAlphabet = findViewById(R.id.tvAlphabet);
        alphaImage = findViewById(R.id.alphaImage);
        et_word = findViewById(R.id.et_word);
        tvSubmit = findViewById(R.id.tvSubmit);

        Random rnd = new Random();
        c = (char) (rnd.nextInt(26) + 'A');

        tvAlphabet.setText(String.valueOf(c));

        //checkFilePermissions();
        tvSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long startTime = System.currentTimeMillis();


                if ((et_word.getText().toString().equals(""))) {
                    alphaImage.setVisibility(View.INVISIBLE);
                    Toast.makeText(AlphabetImages.this, "Please enter a word", Toast.LENGTH_SHORT).show();
                } else if (et_word.getText().toString().toUpperCase().startsWith(String.valueOf(c))) {
                    if (et_word.getText().toString().equalsIgnoreCase(word[0])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(apple).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[1])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(ball).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[2])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(cat).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[3])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(dog).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[4])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(elephant).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[5])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(fish).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[6])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(goat).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[7])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(hat).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[8])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(ink).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[9])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(jackal).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[10])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(kite).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[11])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(lion).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[12])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(monkey).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[13])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(nose).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[14])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(owl).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[15])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(parrot).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[16])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(queen).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[17])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(rat).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[18])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(sheep).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[19])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(teeth).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[20])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(umbrella).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[21])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(violin).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[22])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(water).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[23])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(xmas).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[24])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(yalk).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[25])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(zebra).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[26])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(ant).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[27])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(bag).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[28])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(bat).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[29])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(bee).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[30])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(bird).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[31])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(book).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[32])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(box).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[33])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(brush).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[34])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(bus).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[35])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(cake).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[36])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(car).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[37])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(carrot).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[38])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(chicken).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[39])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(chocolate).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[40])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(church).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[41])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(clock).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[42])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(clown).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[43])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(coconut).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[44])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(cow).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[45])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(crab).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[46])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(crocodile).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[47])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(doll).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[48])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(door).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[49])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(egg).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[50])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(eye).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[51])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(fan).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[52])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(finger).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[53])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(flag).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[54])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(flower).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[55])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(fox).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[56])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(frog).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[57])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(fruit).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[58])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(hand).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[59])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(hen).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[60])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(horse).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[61])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(key).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[62])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(king).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[63])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(leap).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[64])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(leg).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[65])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(lizard).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[66])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(man).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[67])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(milk).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[68])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(moon).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[69])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(net).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[70])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(pen).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[71])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(penguin).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[72])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(pig).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[73])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(rabbit).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[74])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(rainbow).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[75])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(ship).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[76])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(snake).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[77])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(snow).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[78])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(spoon).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[79])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(star).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[80])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(sun).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[81])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(train).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[82])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(tree).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[83])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(turtle).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[84])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(van).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[85])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(whale).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[86])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(wood).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[87])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(xray).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[88])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(zip).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[89])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(zoo).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[90])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(bear).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[91])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(black).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[92])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(deer).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[93])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(foot).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[94])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(green).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[95])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(guava).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[96])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(guitar).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[97])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(hippopotamus).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[98])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(log).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[99])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(mango).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[100])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(orange).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[101])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(pink).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[102])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(tall).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[103])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(teddy).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[104])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(tiger).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[105])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(toy).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[106])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(white).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else if (et_word.getText().toString().equalsIgnoreCase(word[107])) {
                        alphaImage.setVisibility(View.VISIBLE);
                        Glide.with(AlphabetImages.this).load(yellow).centerCrop().placeholder(R.drawable.loading).into(alphaImage);
                    } else {
                        alphaImage.setVisibility(View.INVISIBLE);
                        Toast.makeText(AlphabetImages.this, "This image is not available.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    alphaImage.setVisibility(View.INVISIBLE);
                    Toast.makeText(AlphabetImages.this, "Please enter word starting with " + c, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        getUserInfo();
    }

    private void getUserInfo() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            boolean emailVerified = user.isEmailVerified();
            String uid = user.getUid();

        }
    }

    private void updateUI(FirebaseUser currentUser) {
        String userID = currentUser.getUid();
        storageReference.child(userID + "/cat.png");
        String token = FirebaseInstanceId.getInstance().getToken();

    }


    public void generateRandom(View view) {
        Random rnd = new Random();
        c = (char) (rnd.nextInt(26) + 'A');

        tvAlphabet.setText(String.valueOf(c));
        et_word.setText("");
        alphaImage.setVisibility(View.INVISIBLE);
    }
}
