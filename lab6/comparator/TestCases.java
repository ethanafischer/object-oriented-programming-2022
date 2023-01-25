import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

public class TestCases
{
   private static final Song[] songs = new Song[] {
         new Song("Decemberists", "The Mariner's Revenge Song", 2005),
         new Song("Rogue Wave", "Love's Lost Guarantee", 2005),
         new Song("Avett Brothers", "Talk on Indolence", 2006),
         new Song("Gerry Rafferty", "Baker Street", 1998),
         new Song("City and Colour", "Sleeping Sickness", 2007),
         new Song("Foo Fighters", "Baker Street", 1997),
         new Song("Queen", "Bohemian Rhapsody", 1975),
         new Song("Gerry Rafferty", "Baker Street", 1978)
      };

   @Test
   public void testArtistComparator()
   {
      ArtistComparator artistComparator = new ArtistComparator();
      assertTrue(artistComparator.compare(songs[0],songs[1])<0);
      assertTrue(artistComparator.compare(songs[1],songs[1])==0);
      assertTrue(artistComparator.compare(songs[1],songs[2])>0);
      assertTrue(artistComparator.compare(songs[5],songs[1])<0);
   }

   @Test
   public void testTitleComparator()
   {
      Comparator<Song> titleLambda1 = (s1,s2) ->  s1.getTitle().compareTo(s2.getTitle());
      assertTrue(titleLambda1.compare(songs[0], songs[1])>0);

      Comparator<Song> titleLambda2 = (s2,s3) ->  s2.getTitle().compareTo(s3.getTitle());
      assertTrue(titleLambda2.compare(songs[1], songs[2])<0);
   }

   @Test
   public void testYearExtractorComparator()
   {
      Comparator<Song> yearComp = Comparator.comparing(Song::getYear);
      Comparator<Song> yearCompRev = yearComp.reversed();
      assertTrue(yearCompRev.compare(songs[1],songs[2])>0);
      assertTrue(yearCompRev.compare(songs[0],songs[3])<0);
   }

   @Test
   public void testThenComparing()
   {
      Comparator<Song> c1 = Comparator.comparing(Song::getTitle);
      Comparator<Song> c2 = Comparator.comparing(Song::getArtist);
      assertTrue(c1.thenComparing(c2).compare(songs[3],songs[5])>0);
   }

   @Test
   public void runSort()
   {
      ArtistComparator artistComparator = new ArtistComparator();
      List<Song> songList = new ArrayList<>(Arrays.asList(songs));
      List<Song> expectedList = Arrays.asList(
         new Song("Avett Brothers", "Talk on Indolence", 2006),
         new Song("City and Colour", "Sleeping Sickness", 2007),
         new Song("Decemberists", "The Mariner's Revenge Song", 2005),
         new Song("Foo Fighters", "Baker Street", 1997),
         new Song("Gerry Rafferty", "Baker Street", 1978),
         new Song("Gerry Rafferty", "Baker Street", 1998),
         new Song("Queen", "Bohemian Rhapsody", 1975),
         new Song("Rogue Wave", "Love's Lost Guarantee", 2005)
         );

      Comparator<Song> c1 = Comparator.comparing(Song::getArtist);
      Comparator<Song> c2 = Comparator.comparing(Song::getTitle);
      Comparator<Song> c3 = Comparator.comparing(Song::getYear);

      Comparator<Song> sortAll = c1.thenComparing(c2).thenComparing(c3);
      songList.sort(sortAll);

      assertEquals(songList, expectedList);
   }
}
