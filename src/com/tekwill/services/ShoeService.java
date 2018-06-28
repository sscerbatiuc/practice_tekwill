//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.services;

import com.tekwill.model.*;

/**
 *
 * @since Jun 27, 2018
 * @author sscerbatiuc
 */
public class ShoeService implements Modifiable
{

  private Product[] shoeList = new Shoe[5];

  public void create()
  {
    Product nike;
    for (int i = 0; i < shoeList.length; i++)
    {
      nike = new Shoe(i, "Nike Air Max", 42.0);
      nike.setType("sport");
      shoeList[i] = nike;
    }

  }

  public void find()
  {

  }

  public void delete()
  {

  }

  public void update()
  {

  }

}
