import java.time.LocalTime;

class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
      final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   public boolean equals(Object o)
   {
      if (o == null)
         return false;
      if (o.getClass() != this.getClass())
         return false;

      CourseSection p = (CourseSection) o;
      boolean result = true;

      if (prefix == null)
         result = p.prefix == null;
      else
         result = prefix.equals(p.prefix);

      if (number == null)
         result = result && p.number == null;
      else
         result = result && number.equals(p.number);

      if (startTime == null)
         result = result && p.startTime == null;
      else
         result = result && startTime.equals(p.startTime);

      if (endTime == null)
         result = result && p.endTime == null;
      else
         result = result && endTime.equals(p.endTime);

      return result && enrollment == p.enrollment;

   }

   public int hashCode(){
      int hash = 1;

      hash = hash * 31 + ((prefix == null) ? 0 : prefix.hashCode());
      hash = hash * 31 + ((number == null) ? 0 : number.hashCode());
      hash = hash * 31 + ((Integer)enrollment).hashCode();
      hash = hash * 31 + ((startTime == null) ? 0 : startTime.hashCode());
      hash = hash * 31 + ((endTime == null) ? 0 : endTime.hashCode());

      return hash;
   }

   // additional likely methods not defined since they are not needed for testing
}
