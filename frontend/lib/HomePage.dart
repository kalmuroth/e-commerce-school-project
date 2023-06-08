import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'package:provider/provider.dart';

import 'User.dart';

class HomePage extends StatelessWidget {
  final List<String> products = List.generate(20, (index) => 'Product $index');

  @override
  Widget build(BuildContext context) {
    final user = Provider.of<UserProvider>(context).user;
    return Scaffold(
      appBar: AppBar(
        title: Text('Ecommerce'),
        actions: [
          if (user != null) ...[
            TextButton(
              onPressed: () {
                Provider.of<UserProvider>(context, listen: false).setUser(null);
                Navigator.pushReplacementNamed(context, '/login');
              },
              child: Text(
                'Se déconnecter',
                style: TextStyle(color: Colors.white),
              ),
            ),
            TextButton(
              onPressed: () {
                Navigator.pushNamed(context, '/cart');
              },
              child: Text(
                'Panier',
                style: TextStyle(color: Colors.white),
              ),
            ),
          ] else ...[
            TextButton(
              onPressed: () {
                Navigator.pushNamed(context, '/login');
              },
              child: Text(
                'Login',
                style: TextStyle(color: Colors.white),
              ),
            ),
            TextButton(
              onPressed: () {
                Navigator.pushNamed(context, '/register');
              },
              child: Text(
                'Register',
                style: TextStyle(color: Colors.white),
              ),
            ),
          ],
        ],
      ),
      body: GridView.builder(
        padding: const EdgeInsets.all(10.0),
        itemCount: products.length,
        gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 4, // number of items per row
          crossAxisSpacing: 10.0, // spacing between items horizontally
          mainAxisSpacing: 10.0, // spacing between items vertically
        ),
        itemBuilder: (ctx, i) => GridTile(
          child: Image.network(
            'https://media.istockphoto.com/id/1300459022/fr/photo/produits-cosm%C3%A9tiques-spa-biologiques-naturels-avec-feuilles-deucalyptus-top-voir-les.jpg?s=612x612&w=0&k=20&c=HwY9uY_-L0CYhkCiIbR8_9dSVQOvGzgX3vsrfTekVuQ=', // replace with your product image
            fit: BoxFit.cover,
          ),
          footer: GridTileBar(
            backgroundColor: Colors.black54,
            title: Text(
              products[i],
              textAlign: TextAlign.center,
            ),
          ),
        ),
      ),
    );
  }
}
