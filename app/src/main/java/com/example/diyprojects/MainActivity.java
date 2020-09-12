package com.example.diyprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRV;
    HomeAdapter myAdapter;
   List<Projects> project1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       project1= new ArrayList<>();
       project1.add(new Projects("Yarn wrapped Painted Jars","• Glass Jar(s) (amount up to you) I used 3 jars.\n" +
               "\n" +
               "• Yarn or String. Thickness may vary to add a different look.\n" +
               "\n" +
               "• Spray Paint. Any color, but I used a White Flat can.\n" +
               "\n" +
               "• Paper or Newspaper. This is used lay down while spraying the jars.\n" +
               "\n" +
               "• Scissors\n" +
               "\n" +
               "• Candles (same amount as jars)\n" +
               "\n" +
               "• Lighter\n" +
               "\n" +
               "• Towel. Used for drying water off of jars.","• Let jars sit for 3-5 minutes.\n" +
               "• Peal off the sticker if you used water it should slide right off.\n" +
               "• Make sure all the glue is off.\n" +
               "• Dry off jars completely.\n" +
               "• Cut long strings of yarn, enough to go around the jar multiple times.\n" +
               "\n" +
               "• Wrap the yarn around the jar; make sure to leave the start open for tying off at the end. Be creative, use different patterns to make each jar it’s own, or make a collection of the same.\n" +
               "\n" +
               "• Once done wrapping, tie the end with the start to keep the pattern.\n" +
               "\n" +
               "• Cut off the extra yarn from the knot.\n" +
               "Find dry ground outside.\n" +
               "\n" +
               "• Lay down paper or newspaper for your painting area.\n" +
               "\n" +
               "• If needed put blocks on the corners of the paper so they do not roll up.\n" +
               "\n" +
               "• Turn the jars upside so the open side of the jar is on ground, this is so the paint does not get into the inside of the jar.\n" +
               "\n" +
               "Space the jars out, at least a foot apart of each other. This is so you can fit the spray can in-between the gaps and one jar doesn't get more paint than another.\n" +
               "Use the spray paint to paint, keep the can around 6 inches away from the jar while spraying. This is important to keep the paint from dripping\n" +
               "Go over the whole jar and over the yarn, make sure to get in-between the yarn for the best pattern\n" +
               "Make sure to maintain a equal coat\n" +
               "Finally we get to remove the yarn:\n" +
               "\n" +
               "Cut the yarn at the end of the string by the knot for best results and easiest for removal. *Be careful not to hit the jar with the scissors.\n" +
               "Un-wrap the yarn from the jar. *Make sure to go slow not pulling off any of the paint.\n" +
               "Congratulations you have completed all 6 steps, enjoy!",R.mipmap.yarn));

       project1.add(new Projects("Disco Ball Hanging Planter\n","Hanging ceramic pot - I used a ceramic hanging planter that had a great sphere shape, but there are so many shapes to choose from. My local nursery also had a selection of used pots that had some pretty wacky shapes at a discount.\n" +
               "1000 1cm mirror tiles\n" +
               "sandpaper\n" +
               "stainless steel chain\n" +
               "swivel hook\n" +
               "glue syringe\n" +
               "glue to fill it with\n" +
               "For the inside of the pot I'm using a trimmed plastic pot and drainage dish.","Depending on the surface area of the tiles you're working with, I would either apply glue the back of the gem or the surface of the planter - but not both.\n" +
               "\n" +
               "If you take on this project, just get a feel for the glue - other industrial glues may have a slightly different consistency and flow, just another reason for testing adhesives before applying. (I have heard some unfortunate stories of things being glued together that CANNOT be undone :( Worst.).\n" +
               "\n" +
               "Waiting for the glue to set before moving on to the next area to work on is important. The tiles start holding their place after about a minute, but you don't want to do any inversions or move it around too much.\n" +
               "\n" +
               "Remember, WORK WITH GRAVITY - science is your friend.\n" +
               "\n" +
               "The glue takes 10 minutes to really set - if it is too cold or damp where you are trying to use glues, you can use a hair dryer on low to speed up the setting process.\n" +
               "\n" +
               "After the glue has set for a full 24 hours, you can pull off any remaining masking tape or pesky glue strings quite easily with a pair of tweezers.\n"+"I found it looked best when I staggered the seams of the glass tiles, starting at a new point on each row that was glued on to the form.\n" +
               "\n" +
               "Not to sound like the Bob Ross of adhesives, but it's your disco ball planter, play with it - there are no mistakes.\n"+"\n"+"Working in the round for many rows can be very meditative, but don't zen out so much that you cover up the holes where the hardware is supposed to go with mirror tiles.\n" +
               "\n" +
               "You may have to play with the spacing around the holes so wait for the row below it to be completely dried first.\n" +
               "In the future I hope to figure out a more refined hanging hardware solution, but in the interim, I looked around my studio and had a boatload of copper magnet wire whcih is both very easy to shape and cut while being very strong.\n" +
               "\n" +
               "Using a wire cutter, I cut 4x 10\" lengths of magnet wire and 4x 2' long sections of stainless steel chain. I later shortened the chain a few inches before hanging the planter.\n" +"\n"+
               "Working one mounting point at a time, I inserted the the magnet wire into through the hole in the top of the ceramic pot and looped it back on itself using a pair of jewelry pliers to create a few securing loops, then trimmed the excess.\n" +
              "\n"+"I connected the chain by opening the bottom link of each chain length with pliers and securing it around the magnet wire. The top of each chain length meets at the clip on swivel hardware listed in the tools and materials step.",R.mipmap.disco));


              project1.add(new Projects("Crayon and Pencil Holders","Glue™\n" +
              "-Low-tack masking tape\n" +
              "- Tin cans – desired size\n" +
              "-Pencils\n" +
              "-Crayons","Pencil Holder:\n" +
              "1. Remove labels from can then thoroughly wash and dry.\n" +
              "2. Sharpen pencils to different lengths. Apply a thin bead of Glue to length of pencil then press in place on side of can, sharpened end down as shown.\n" +
              "3. Working in sections at a time, glue pencils in place, holding with low-tack masking tape as needed. Let dry then remove tape.\n" +
              "\n" +
              "Crayon Holder:\n" +
              "4. Working in sections at a time, apply a thin bead of glue to paper label on crayon then press in place on can with tip pointed upward as shown. Let dry.\n" +
              "\n" +
              "Additional tip: Line can with felt or paint the insides for a finished look.",R.mipmap.crayon));

              project1.add(new Projects("Captain America's Shield","Cardboard.\n" +
                      "Pencil,marker or pen.\n" +
                      "A4 size white paper.\n" +
                      "Scale.\n" +
                      "Glue.\n" +
                      "Tape.\n" +
                      "Glue gun(not really necessary).","Draw a triangle on a a4 size paper with sides 28 and base 12 cm.Cut the triangle out and draw 14-15 triangle on the cardboard sheet.Cut them too and measure that if they are equal.\n" +
                      "\n" +
                      "\n" +
                      " Curving & Joining\n" +
                      "Curve the triangles . You can curve as shown in the image or you can also put it on any curve surface.Join the curved triangles side to side by first using a glue gun and secondly supporting the structure using a tape.You can also use tape if you don't have a glue gun(for that you we need a helping hand).Make sure that you apply tape to both the sides in case the shield is sensitive at this stage.\n" +
                      "\n" +
                      "\n" +
                      "MAKING SHIELD STRONGER\n" +
                      "Now this is the most important part because through this our shield get hard and tough.Just get some old newspapers and glue.Take glue and water in equal amounts and mix them,cut the pieces of newspapers.Now put the piece on the shield and cover it completely with the mixture.Do this to the whole shield.\n" +
                      "\n" +
                      "Let it dry for an hour then add two holders on the back.I have used a empty tape roll for putting my hand and a handle with cardboard.Don't think about the thing in the middle,it is just a plastic cap for supporting the shield.(not necessary).\n" +
                      "\n" +
                      "COLORING\n" +
                      "So now make three circles from big to small.Color the first circle with a blue color,second red,third white,and the last red.I have used acrylic colours as they are thinner and shiner than postal colours.\n" +
                      "\n" +
                      "Now our shield is ready to protect us.For the final touch add a star in the center which you can cut from aluminium foil easily.Enjoy.....",R.mipmap.shield));

              project1.add(new Projects("Adhesive Lamp Shade","A roll of wide clear adhesive tape\n" +
                      "A lamp-holder\n" +
                      "A light bulb\n" +
                      "A salad bowl, the size you want your lampshade to be. I recommend you use a metal one because they are resistant and light to work with, but you can also use a wooden one or a glass one.\n" +
                      "A bit of baby powder. You can use body powder, foot powder or even cornstarch if you don't have the prior ones at home.\n" +
                      "Scissors\n" +
                      "Brush\n" +
                      "Pencil","Prepare your lamp shade to hold the lamp holder. Use your pencil to mark where you need to make a hole to get your cable through.\n" +
                      "\n" +
                      "Now place the lamp holder following the directions needed and screw the light bulb in... And you are done!",R.mipmap.lamp));

              myRV=(RecyclerView)findViewById(R.id.recyclerview_id);
              myAdapter= new HomeAdapter(this,project1);
              myRV.setLayoutManager(new LinearLayoutManager(this));
              myRV.setAdapter(myAdapter);
    }
}