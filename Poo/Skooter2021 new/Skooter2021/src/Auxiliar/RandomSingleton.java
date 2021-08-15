/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

/**
 *
 * @author joaom
 * uma boa pratica é deixar o random como um singleton, para evitar problemas
 * 
 */
  
import java.util.Random;

public class RandomSingleton
{
    private static final int DEFAULT_SEED = 42;
    private static RandomSingleton instance;
    private final Random random;

    private RandomSingleton()
    {
        random = new Random(DEFAULT_SEED);
    }

  
    public static RandomSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new RandomSingleton();
        }
        return instance;
    }

    
    public int nextInt(int max)
    {
        return random.nextInt(max);
    }
}